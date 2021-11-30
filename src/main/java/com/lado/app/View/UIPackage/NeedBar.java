package com.lado.app.View.UIPackage;

import javax.swing.JProgressBar;

import com.lado.app.Model.Tamagotchi.Need;

import java.awt.Color;

public class NeedBar extends JProgressBar{
    NeedBar(Need inputNeed)
    {
        this.setBounds(300, 190, 560, 30);
        this.setForeground(Color.GREEN);
        this.setStringPainted(true);
        this.setValue(inputNeed.getVal());
        
    }
    
}
