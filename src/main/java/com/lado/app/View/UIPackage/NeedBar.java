package com.lado.app.View.UIPackage;

import javax.swing.JProgressBar;

import com.lado.app.Model.Tamagotchi.Need;

import java.awt.Color;

public class NeedBar extends JProgressBar{
    NeedBar(int input)
    {
        this.setBounds(300, 190, 560, 30);
        this.setForeground(new Color(46, 204, 113));//green
        this.setStringPainted(true);
        this.setValue(input);   
    }
    
    void updateNeed(int value)
    {
        this.setValue(value);
    }
}
