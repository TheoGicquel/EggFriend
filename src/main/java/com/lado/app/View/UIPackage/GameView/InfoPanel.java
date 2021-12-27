/**
 * @file InfoPanel.java
 * @author Theo Gicquel
*/
package com.lado.app.view.uipackage.gameview;

import javax.swing.JPanel;

import com.lado.app.controller.TamagotchiController;

import javax.swing.ImageIcon;

import javax.swing.JLabel;





/**
 * @class InfoPanel
 * @brief Panel affichant les informations du tamagotchi via 3 JLabels
 */
public class InfoPanel extends JPanel{
    

    java.net.URL tamagotchiImageUrl;
    java.net.URL tamagotchiDeadUrl;
    /* 
    * on déclare le controller comme étant transient car il ne sera pas serialisé 
    * et donc non persistant
    */
    transient TamagotchiController controller;
    JLabel image;
    JLabel moodLabel;
    private static final String LABEL_PRETEXT = "Statut :   ";

    InfoPanel(TamagotchiController gameController)
    {
        this.controller = gameController;

        
        String imagePath = "images/" + controller.getSpecie() + ".png";
        
        tamagotchiImageUrl = getClass().getClassLoader().getResource(imagePath);
        if(tamagotchiImageUrl != null)
        {
        image = new JLabel( new ImageIcon(tamagotchiImageUrl) );
        image.setBounds(0, 0, 10, 10);
        this.add(image);
        }

        JLabel nameLabel = new JLabel("Nom :   " + controller.getName());
        this.add(nameLabel);

        JLabel ageLabel = new JLabel("Type :   " + controller.getSpecieName());
        this.add(ageLabel);

        moodLabel = new JLabel(LABEL_PRETEXT + controller.getMood());
        this.add(moodLabel);
    }

    public void setDeadImage()
    {
        String deadImagePath = "images/" + controller.getSpecie() + "_dead.png";
        
        tamagotchiDeadUrl = getClass().getClassLoader().getResource(deadImagePath);
        if(tamagotchiDeadUrl != null)
        {
            this.image = new JLabel( new ImageIcon(tamagotchiDeadUrl) );
            this.revalidate();
        }

    }

    public void updateMoodLabel()
    {
        if(controller.isTamagotchiAlive()){
        moodLabel.setText(LABEL_PRETEXT + controller.getMood());
        }
        else
        {
            moodLabel.setText(LABEL_PRETEXT + " Mort ☠️");
        }
    }
}
