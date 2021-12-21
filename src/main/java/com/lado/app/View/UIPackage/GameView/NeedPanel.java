package com.lado.app.View.UIPackage.GameView;


import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;



public class NeedPanel extends JPanel {

    JProgressBar bar;
    JLabel nameLabel;

    NeedPanel(int inputValue,String buttonString, String iconPath)
    {
        //Border blackline = BorderFactory.createLineBorder(Color.black);
        // this.setBorder(blackline);
       this.nameLabel = new JLabel(buttonString);
        this.bar = new NeedBar(inputValue); 


        this.add(bar);
        this.add(nameLabel);
    }

    void updateNeed(int value)
    {
        this.bar.setValue(value);
        this.bar.setString(value+" %");
    }

    




}
