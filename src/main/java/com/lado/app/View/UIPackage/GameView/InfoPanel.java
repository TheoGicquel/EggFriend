/**
 * @file InfoPanel.java
 * @author Theo Gicquel
*/
package com.lado.app.View.UIPackage.GameView;

import javax.swing.JPanel;



import javax.swing.ImageIcon;

import javax.swing.JLabel;

import com.lado.app.Controller.TamagotchiController;





/**
 * @class InfoPanel
 * @brief Panel affichant les informations du tamagotchi via 3 JLabels
 */
public class InfoPanel extends JPanel{
    

    java.net.URL tamagotchiImageUrl;

    InfoPanel(TamagotchiController controller)
    {


        
        String imagePath = "images/" + controller.getSpecie() + ".png";
        
        tamagotchiImageUrl = getClass().getClassLoader().getResource(imagePath);
        System.out.println(tamagotchiImageUrl);
        if(tamagotchiImageUrl != null)
        {
        JLabel image = new JLabel( new ImageIcon(tamagotchiImageUrl) );
        image.setBounds(0, 0, 10, 10);
        this.add(image);
        }

        JLabel nameLabel = new JLabel("Nom :   " + controller.getName());
        this.add(nameLabel);

        JLabel ageLabel = new JLabel("Type :   " + controller.getSpecieName());
        this.add(ageLabel);

        JLabel moodLabel = new JLabel("Humeur :   " + controller.getMood());
        this.add(moodLabel);
    }
}
