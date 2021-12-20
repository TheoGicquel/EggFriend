package com.lado.app.View.UIPackage;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;



public class NeedPanel extends JPanel {


    NeedPanel(int inputValue,String buttonString, String iconPath)
    {
        //Border blackline = BorderFactory.createLineBorder(Color.black);
        // this.setBorder(blackline);
        JLabel nameLabel = new JLabel(buttonString);
        JProgressBar bar = new NeedBar(inputValue); 
    
        this.add(bar);
        this.add(nameLabel);
    }

    




}
