package com.lado.app.View.UIPackage.GameView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.Border;
import com.lado.app.Controller.GameListener;
import com.lado.app.Controller.TamagotchiController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class GameView implements ActionListener{
  
  private TamagotchiController model;
  private JButton saveBtn;
  private JButton refreshBtn;
  private JButton degradeBtn;
  
  public GameView(TamagotchiController model,boolean isNewGame) {
    JFrame frame = new JFrame();
    this.model = model;




    if(isNewGame)
    {
        frame.setTitle("TamagotchiGame - Nouvelle Partie");
    }
    else
    {
        frame.setTitle("TamagotchiGame - Charger Partie");
    }

     //listener = new GameListener(model);

     frame.setSize(400, 400);
     frame.setLocationRelativeTo(null);
    // frame.setTitle("TITRE FENETRE");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setResizable(true);
     ImageIcon appIcon = new ImageIcon("src/main/resources/images/logo.png");
    frame.setIconImage(appIcon.getImage());
 
    
    Color backgroundColor = new Color(0xa0a0a0);
    frame.getContentPane().setBackground(backgroundColor);

    JLabel nameLbl = new JLabel();
    nameLbl.setText("Name: " + model.getName());

    //nameLbl.setIcon(appIcon);
    nameLbl.setFont(new Font("Arial", Font.BOLD, 14));
    nameLbl.setForeground(Color.WHITE);
    nameLbl.setHorizontalTextPosition(JLabel.CENTER);
    nameLbl.setVerticalTextPosition(JLabel.TOP);

    frame.add(nameLbl);


    NeedBar hungerBar = new NeedBar(model.getHunger());
    NeedBar healthBar = new NeedBar(model.getHealth());
    NeedBar happinessBar = new NeedBar(model.getHapiness());
    NeedBar energyBar = new NeedBar(model.getEnergy());

    JButton feedBtn = new JButton("Nourrir");
    JButton playBtn = new JButton("Jouer");
    JButton sleepBtn = new JButton("Sieste");
    JButton cleanBtn = new JButton("Laver");

    saveBtn = new JButton("Sauvegarder");
    refreshBtn = new JButton("Rafraichir");
    degradeBtn = new JButton("[DEBUG]");


    //NeedBar needBars[] = {hungerBar, healthBar, happinessBar, energyBar};
    JButton[] careButtons = {feedBtn, playBtn, sleepBtn, cleanBtn};

    JButton[] dataButtons = {saveBtn,refreshBtn,degradeBtn};

    for (JButton jButton : careButtons) {
      jButton.addActionListener(this);
    }

    for (JButton jButton : dataButtons) {
      jButton.addActionListener(this);
    }
  
    saveBtn.addActionListener(this);


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

    frame.getContentPane().add(ui);
    frame.pack();
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    
    if(e.getSource()==saveBtn)
    {
      System.out.println("SAVE !!");
      model.saveGame();
    }
    
  }


}
