package com.lado.app.UIPackage;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import java.awt.Color;

import com.lado.app.Tamagotchi.Need;

public class CarePanel extends JPanel{
    CarePanel(Need inputNeed,String buttonString)
    {
        Border blackline = BorderFactory.createLineBorder(Color.black);
        this.setBorder(blackline);
        JButton careButton = new JButton(buttonString);
        
        this.add(careButton);
        
    }
}
