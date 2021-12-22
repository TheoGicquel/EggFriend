package com.lado.app.View.UIPackage;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;
import com.lado.app.Controller.GameListener;
import com.lado.app.Model.Tamagotchi.Tamagotchi;
 
public class GameFrame extends Window {
  private GameListener listener;
  
  public GameFrame(Tamagotchi tamagotchi) {



     listener = new GameListener(tamagotchi);


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


    NeedBar hungerBar = new NeedBar(tamagotchi.hunger);
    NeedBar healthBar = new NeedBar(tamagotchi.health);
    NeedBar happinessBar = new NeedBar(tamagotchi.happiness);
    NeedBar energyBar = new NeedBar(tamagotchi.energy);

    JButton feedBtn = new JButton("Nourrir");
    JButton playBtn = new JButton("Jouer");
    JButton sleepBtn = new JButton("Sieste");
    JButton cleanBtn = new JButton("Laver");

    NeedBar needBars[] = {hungerBar, healthBar, happinessBar, energyBar};
    JButton[] careButtons = {feedBtn, playBtn, sleepBtn, cleanBtn};

    for (JButton jButton : careButtons) {
      jButton.addActionListener(listener);
    }
  


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

    JPanel infoPanel = new InfoPanel(tamagotchi);
  
    JPanel carePanels[] = {hungerCarePanel, energyCarePanel, cleanlinessCarePanel, happinessCarePanel};
    JPanel needPanels[] = {healthPanel, hungerPanel, energyPanel, cleanLinessPanel, happinessPanel};

    JPanel ui = new JPanel();
    ui.setLayout(new BoxLayout(ui,BoxLayout.PAGE_AXIS));

  


    JPanel needsUI = new JPanel();
    needsUI.setLayout(new BoxLayout(needsUI,BoxLayout.PAGE_AXIS));

    JPanel careUI = new JPanel();

    for (JPanel needPanel : needPanels) {
      needsUI.add(needPanel);
    }

    for (JPanel carePanel : carePanels) {
      careUI.add(carePanel);
    }

    infoPanel.setLayout(new BoxLayout(infoPanel,BoxLayout.PAGE_AXIS));
    infoPanel.setBorder(blueBorder);
    needsUI.setBorder(blueBorder);
    careUI.setBorder(blueBorder);
    ui.add(infoPanel);
    ui.add(needsUI);
    ui.add(careUI);

    this.getContentPane().add(ui);
    this.pack();
    this.setVisible(true);
  }


}
