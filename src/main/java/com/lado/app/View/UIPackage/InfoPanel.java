/**
 * @file InfoPanel.java
 * @author Theo Gicquel
*/
package com.lado.app.View.UIPackage;

import javax.swing.JPanel;



import javax.swing.ImageIcon;

import javax.swing.JLabel;

import com.lado.app.Controller.TamagotchiController;
import com.lado.app.Model.Tamagotchi.Tamagotchi;


import javax.swing.border.Border;
import javax.swing.BorderFactory;

import java.awt.Color;




/**
 * @class InfoPanel
 * @brief Panel affichant les informations du tamagotchi via 3 JLabels
 */
public class InfoPanel extends JPanel{
    
    InfoPanel(TamagotchiController controller)
    {

        Border blackline = BorderFactory.createLineBorder(Color.black);
        // this.setBorder(blackline);
        String imagePath = "src/main/resources/" + controller.getSpecie() + ".png";
        JLabel image = new JLabel( new ImageIcon(imagePath) );
        image.setBounds(0, 0, 10, 10);
        
        this.add(image);

        JLabel nameLabel = new JLabel("Nom :   " + controller.getName());
        this.add(nameLabel);

        JLabel ageLabel = new JLabel("Type :   " + controller.getSpecie());
        this.add(ageLabel);

        JLabel moodLabel = new JLabel("Humeur :   " + controller.getMood());
        this.add(moodLabel);
    }
}
