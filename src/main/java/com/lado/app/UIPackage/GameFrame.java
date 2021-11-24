package com.lado.app.UIPackage;

import com.lado.app.Tamagotchi.Tamagotchi;
import com.lado.app.UIPackage.UIBuilder.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class GameFrame extends Window {

  public GameFrame(Tamagotchi tamagotchi) {
    this.setSize(400, 400);
    this.setTitle("TITRE FENETRE");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    // ImageIcon appIcon = new ImageIcon("src/main/resources/images/logo.png");
    // this.setIconImage(appIcon.getImage());
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

    Border blueBorder = BorderFactory.createLineBorder(Color.BLUE);

    JPanel healthPanel = new NeedPanel(tamagotchi.health,tamagotchi.health.getName(),"icon");
    JPanel hungerPanel = new NeedPanel(tamagotchi.hunger,tamagotchi.hunger.getName(),"icon");
    JPanel energyPanel = new NeedPanel(tamagotchi.energy,tamagotchi.energy.getName(),"icon");
    JPanel cleanLinessPanel = new NeedPanel(tamagotchi.cleanliness,tamagotchi.cleanliness.getName(),"icon");
    JPanel happinessPanel = new NeedPanel(tamagotchi.happiness,tamagotchi.happiness.getName(),"icon");
    

    JPanel hungerCarePanel = new CarePanel(tamagotchi.hunger,"Nourrir");
    JPanel energyCarePanel = new CarePanel(tamagotchi.energy,"Sieste");
    JPanel cleanlinessCarePanel = new CarePanel(tamagotchi.cleanliness,"Laver");
    JPanel happinessCarePanel = new CarePanel(tamagotchi.happiness,"Jouer");
  


    JPanel ui = new JPanel();
    ui.setLayout(new BoxLayout(ui,BoxLayout.PAGE_AXIS));

    JPanel needsUI = new JPanel();
    needsUI.setLayout(new BoxLayout(needsUI,BoxLayout.PAGE_AXIS));

    JPanel careUI = new JPanel();

    needsUI.add(healthPanel);
    needsUI.add(hungerPanel);
    needsUI.add(energyPanel);

    careUI.add(hungerCarePanel);
    careUI.add(energyCarePanel);

    needsUI.setBorder(blueBorder);
    careUI.setBorder(blueBorder);
    ui.add(needsUI);
    ui.add(careUI);

    this.getContentPane().add(ui);
    this.pack();
    this.setVisible(true);
  }

  void init() {}


  public void build()
  {

  }
}
