package com.lado.app.UIPackage;
import javax.swing.*;
import java.awt.Font;
import javax.swing.JFrame;
import com.lado.app.UIPackage.UIBuilder.*;

public class GameFrame extends JFrame{
    JFrame gameFrame;

    public GameFrame()
    {
       
        // constantes 
    // Définitions des polices d'écriture
    Font normalFont = new Font("Arial", Font.BOLD, 12);
    Font largeFont = new Font("Arial", Font.BOLD, 16);
    Font hugeFont = new Font("Arial", Font.BOLD, 24); //Style et taille du contenu de l'étiquette.

    int barLabelDefaulty = 165;
    int barLabelDefaultX = 300;
    int barLabelIncrement = 60;





        setTitle("EggFriend");
    

        JLabel cleanLinessLabel = UIBuilder.verticalBuilder(
            "health points",
            barLabelDefaultX,
            barLabelDefaulty,
            barLabelIncrement,
            3,
            normalFont
          ); 
        // create button
        JButton button = new JButton("click");
 
        button.setBounds(165, 135, 115, 55);
         
        // adding button on frame
        add(button);
 
        // setting close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }
    }
