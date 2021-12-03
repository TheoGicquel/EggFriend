package com.lado.app.View.UIPackage;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import com.lado.app.Model.Tamagotchi.Need;


public class NeedPanel extends JPanel {


    NeedPanel(Need inputNeed,String buttonString, String iconPath)
    {
        //Border blackline = BorderFactory.createLineBorder(Color.black);
        // this.setBorder(blackline);
        JLabel nameLabel = new JLabel(inputNeed.getName());
        JProgressBar bar = new NeedBar(inputNeed); 
    
        this.add(bar);
        this.add(nameLabel);
    }

    




}
