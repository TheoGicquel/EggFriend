package com.lado.app.View.UIPackage;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.Border;
import com.lado.app.Controller.GameListener;
import com.lado.app.Controller.TamagotchiController;
import com.lado.app.Model.Tamagotchi.Tamagotchi;
 
public class GameFrame extends Window {
  private GameListener listener;
  
  public GameFrame(TamagotchiController model,boolean isNewGame) {

    if(isNewGame)
    {
        this.setTitle("TamagotchiGame - Nouvelle Partie");
    }
    else
    {
        this.setTitle("TamagotchiGame - Charger Partie");
    }

     //listener = new GameListener(model);

     this.setSize(400, 400);
     this.setLocationRelativeTo(null);
    // this.setTitle("TITRE FENETRE");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setResizable(true);
     ImageIcon appIcon = new ImageIcon("src/main/resources/images/logo.png");
    this.setIconImage(appIcon.getImage());
 
    
    Color backgroundColor = new Color(0xa0a0a0);
    this.getContentPane().setBackground(backgroundColor);

    JLabel nameLbl = new JLabel();
    nameLbl.setText("Name: " + model.getName());

    //nameLbl.setIcon(appIcon);
    nameLbl.setFont(new Font("Arial", Font.BOLD, 14));
    nameLbl.setForeground(Color.WHITE);
    nameLbl.setHorizontalTextPosition(JLabel.CENTER);
    nameLbl.setVerticalTextPosition(JLabel.TOP);

    this.add(nameLbl);


    NeedBar hungerBar = new NeedBar(model.getHunger());
    NeedBar healthBar = new NeedBar(model.getHealth());
    NeedBar happinessBar = new NeedBar(model.getHapiness());
    NeedBar energyBar = new NeedBar(model.getEnergy());

    JButton feedBtn = new JButton("Nourrir");
    JButton playBtn = new JButton("Jouer");
    JButton sleepBtn = new JButton("Sieste");
    JButton cleanBtn = new JButton("Laver");

    JButton saveBtn = new JButton("Sauvegarder");
    JButton refreshBtn = new JButton("Rafraichir");
    JButton degradeBtn = new JButton("[DEBUG]");


    NeedBar needBars[] = {hungerBar, healthBar, happinessBar, energyBar};
    JButton[] careButtons = {feedBtn, playBtn, sleepBtn, cleanBtn};

    JButton[] dataButtons = {saveBtn,refreshBtn,degradeBtn};

    for (JButton jButton : careButtons) {
      jButton.addActionListener(listener);
    }

    for (JButton jButton : dataButtons) {
      jButton.addActionListener(listener);
    }
  


    Border blueBorder = BorderFactory.createLineBorder(Color.BLUE);

    JPanel healthPanel = new NeedPanel(model.getHealth(),model.getHealthNaming(),"icon");
    JPanel hungerPanel = new NeedPanel(model.getHunger(),model.getHungerNaming(),"icon");
    JPanel energyPanel = new NeedPanel(model.getEnergy(),model.getEnergyNaming(),"icon");
    JPanel cleanLinessPanel = new NeedPanel(model.getCleanliness(),model.getCleanlinessNaming(),"icon");
    JPanel happinessPanel = new NeedPanel(model.getHappiness(),model.getCleanlinessNaming(),"icon");

    JPanel hungerCarePanel = new CarePanel(feedBtn);
    JPanel energyCarePanel = new CarePanel(sleepBtn);
    JPanel cleanlinessCarePanel = new CarePanel(cleanBtn);
    JPanel happinessCarePanel = new CarePanel(playBtn);

    JPanel infoPanel = new InfoPanel(model);
  
    JPanel carePanels[] = {hungerCarePanel, energyCarePanel, cleanlinessCarePanel, happinessCarePanel};
    JPanel needPanels[] = {healthPanel, hungerPanel, energyPanel, cleanLinessPanel, happinessPanel};

    JPanel ui = new JPanel();
    ui.setLayout(new BoxLayout(ui,BoxLayout.LINE_AXIS));

  


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
   // infoPanel.setBorder(blueBorder);
    infoPanel.add(saveBtn);
    infoPanel.add(degradeBtn);



   // needsUI.setBorder(blueBorder);
   // careUI.setBorder(blueBorder);

    JPanel tamaPanel = new JPanel();
    tamaPanel.setLayout(new BoxLayout(tamaPanel,BoxLayout.PAGE_AXIS));

    JPanel needAndCarePanel = new JPanel();
    needAndCarePanel.setLayout(new BoxLayout(needAndCarePanel,BoxLayout.PAGE_AXIS));
    needAndCarePanel.add(needsUI);
    needAndCarePanel.add(careUI);


    tamaPanel.add(infoPanel);
    ui.add(tamaPanel);
    ui.add(needAndCarePanel);

    this.getContentPane().add(ui);
    this.pack();
    this.setVisible(true);
  }


}
