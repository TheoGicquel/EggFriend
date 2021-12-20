package com.lado.app.View.UIPackage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewGameNameDialog {
    
    public String get(JFrame frame)
    {
    String tamaName="";
    while(tamaName.length()<=1){
     tamaName = ">";
      tamaName = tamaName + JOptionPane.showInputDialog(frame,"Nom du Tamagotchi :");   
    }
    tamaName = tamaName.substring(1);

    return tamaName;
    }
}
