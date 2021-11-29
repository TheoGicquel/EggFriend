package com.lado.app.View.UIPackage;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;
import com.lado.app.Controller.GameListener;
import com.lado.app.Controller.GameListener;
import com.lado.app.Model.Tamagotchi.Need;
import com.lado.app.Model.Tamagotchi.Tamagotchi;
 

public class GameFrame extends Window {
  private GameListener listener;
  public GameFrame(Tamagotchi tamagotchi) {
    this.setSize(400, 400);
    this.setTitle("TITRE FENETRE");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    // ImageIcon appIcon = new ImageIcon("src/main/resources/images/logo.png");
    // this.setIconImage(appIcon.getImage());

     listener = new GameListener();


    Color backgroundColor = new Color(0xa0a0a0);
    this.getContentPane().setBackground(backgroundColor);

    JLabel nameLbl = new JLabel();
    nameLbl.setText("Name: " + tamagotchi.getName());

    //nameLbl.setIcon(appIcon);
    nameLbl.setFont(new Font("Arial", Font.BOLD, 14));
    nameLbl.setForeground(Color.WHITE);
    nameLbl.setHorizontalTextPosition(JLabel.CENTER);
    nameLbl.setVerticalTextPosition(JLabel.TOP);

    this.add(nameLbl);

    // TODO : instancier tous les elements de l'UI pour pouvoir y acceder pour l'implémentation des EventListeners


    /**
     *  Implementation des barres de vie et labels
     */

    
    NeedBar hungerBar = new NeedBar(tamagotchi.hunger);
    NeedBar healthBar = new NeedBar(tamagotchi.health);
    NeedBar happinessBar = new NeedBar(tamagotchi.happiness);
    NeedBar energyBar = new NeedBar(tamagotchi.energy);

    JButton feedBtn = new JButton("Nourrir");
    JButton playBtn = new JButton("Jouer");
    JButton sleepBtn = new JButton("Sieste");
    JButton cleanBtn = new JButton("Laver");
    feedBtn.addActionListener(listener);
    playBtn.addActionListener(listener);
    sleepBtn.addActionListener(listener);
    cleanBtn.addActionListener(listener);

    Border blueBorder = BorderFactory.createLineBorder(Color.BLUE);

    JPanel healthPanel = new NeedPanel(tamagotchi.health,tamagotchi.health.getName(),"icon");
    JPanel hungerPanel = new NeedPanel(tamagotchi.hunger,tamagotchi.hunger.getName(),"icon");
    JPanel energyPanel = new NeedPanel(tamagotchi.energy,tamagotchi.energy.getName(),"icon");
    JPanel cleanLinessPanel = new NeedPanel(tamagotchi.cleanliness,tamagotchi.cleanliness.getName(),"icon");
    JPanel happinessPanel = new NeedPanel(tamagotchi.happiness,tamagotchi.happiness.getName(),"icon");

    JPanel hungerCarePanel = new CarePanel(tamagotchi.hunger,feedBtn);
    JPanel energyCarePanel = new CarePanel(tamagotchi.energy,sleepBtn);
    JPanel cleanlinessCarePanel = new CarePanel(tamagotchi.cleanliness,cleanBtn);
    JPanel happinessCarePanel = new CarePanel(tamagotchi.happiness,playBtn);
  
    

    JPanel ui = new JPanel();
    ui.setLayout(new BoxLayout(ui,BoxLayout.PAGE_AXIS));

    JPanel needsUI = new JPanel();
    needsUI.setLayout(new BoxLayout(needsUI,BoxLayout.PAGE_AXIS));

    JPanel careUI = new JPanel();

    needsUI.add(healthPanel);
    needsUI.add(hungerPanel);
    needsUI.add(energyPanel);
    needsUI.add(cleanLinessPanel);
    needsUI.add(happinessPanel);

    careUI.add(hungerCarePanel);
    careUI.add(energyCarePanel);
    careUI.add(cleanlinessCarePanel);
    careUI.add(happinessCarePanel);

    needsUI.setBorder(blueBorder);
    careUI.setBorder(blueBorder);
    ui.add(needsUI);
    ui.add(careUI);

    this.getContentPane().add(ui);
    this.pack();
    this.setVisible(true);
  }


}
