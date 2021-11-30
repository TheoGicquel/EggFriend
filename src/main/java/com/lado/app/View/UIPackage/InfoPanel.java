package com.lado.app.View.UIPackage;

import javax.swing.JPanel;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

import com.lado.app.Model.Tamagotchi.Need;
import com.lado.app.Model.Tamagotchi.Tamagotchi;

import java.awt.Color;
import java.lang.ProcessHandle.Info;

public class InfoPanel extends JPanel{
    
    InfoPanel(Tamagotchi tamagotchi)
    {
        JLabel nameLabel = new JLabel("Nom :" + tamagotchi.getName());
        this.add(nameLabel);

        JLabel ageLabel = new JLabel("Type :" + tamagotchi.getBreed());
        this.add(ageLabel);

        JLabel moodLabel = new JLabel("Humeur : " + tamagotchi.getMood());
        this.add(moodLabel);
    }
}
