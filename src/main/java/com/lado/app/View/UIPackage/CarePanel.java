package com.lado.app.View.UIPackage;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import javax.swing.JPanel;

import javax.swing.border.Border;

import com.lado.app.Model.Tamagotchi.Need;

import java.awt.Color;

public class CarePanel extends JPanel{
    CarePanel(Need inputNeed,JButton careButton)
    {
        Border blackline = BorderFactory.createLineBorder(Color.black);
        this.setBorder(blackline);

        
        this.add(careButton);
        
    }
}
