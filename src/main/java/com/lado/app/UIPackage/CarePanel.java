package com.lado.app.UIPackage;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import javax.swing.JPanel;

import javax.swing.border.Border;
import java.awt.Color;

import com.lado.app.Tamagotchi.Need;

public class CarePanel extends JPanel{
    CarePanel(Need inputNeed,JButton careButton)
    {
        Border blackline = BorderFactory.createLineBorder(Color.black);
        this.setBorder(blackline);
        //FIXME - Enlever ce systeme de boutons

       
        
        this.add(careButton);
        
    }
}
