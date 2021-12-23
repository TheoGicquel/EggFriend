package com.lado.app.View.UIPackage.GameView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import com.lado.app.Controller.TamagotchiController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

 
public class GameView implements ActionListener{
  
  private TamagotchiController controller;
  private JButton saveBtn;
  private JButton refreshBtn;
  private JButton degradeBtn;
  JButton feedBtn;
  JButton playBtn;
  JButton sleepBtn;
  JButton cleanBtn;
  NeedBar hungerBar;
  NeedBar healthBar;
  NeedBar happinessBar;
  NeedBar energyBar;
  JFrame frame;

  NeedPanel healthPanel;
  NeedPanel hungerPanel;
  NeedPanel energyPanel;
  NeedPanel cleanLinessPanel;
  NeedPanel happinessPanel;


  CarePanel hungerCarePanel;
  CarePanel energyCarePanel;
  CarePanel cleanlinessCarePanel;
  CarePanel happinessCarePanel;

  JPanel needsUI;
  JPanel needAndCarePanel;
  JPanel ui;

  JProgressBar testbar;
  long firsttime=System.currentTimeMillis();

  java.net.URL imageLogoUrl;

  public GameView(){}
  
  
  public GameView(TamagotchiController controller,boolean isNewGame) {
    frame = new JFrame();
    this.controller = controller;
    firsttime= System.currentTimeMillis();

    frame.setTitle("EggFriend -"+controller.getName());

     //listener = new GameListener(model);

     frame.setSize(400, 400);
     frame.setLocationRelativeTo(null);
    // frame.setTitle("TITRE FENETRE");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setResizable(true);
     imageLogoUrl = GameView.class.getResource("images/logo.png");
     ImageIcon appIcon = new ImageIcon(imageLogoUrl);
    frame.setIconImage(appIcon.getImage());
 
    
    Color backgroundColor = new Color(0xa0a0a0);
    frame.getContentPane().setBackground(backgroundColor);

    JLabel nameLbl = new JLabel();
    nameLbl.setText("Name: " + controller.getName());

    //nameLbl.setIcon(appIcon);
    nameLbl.setFont(new Font("Arial", Font.BOLD, 14));
    nameLbl.setForeground(Color.WHITE);
    nameLbl.setHorizontalTextPosition(JLabel.CENTER);
    nameLbl.setVerticalTextPosition(JLabel.TOP);

    frame.add(nameLbl);


     hungerBar = new NeedBar(11);
     healthBar = new NeedBar(controller.getHealth());
     happinessBar = new NeedBar(controller.getHapiness());
     energyBar = new NeedBar(controller.getEnergy());
      testbar = new JProgressBar();
    feedBtn = new JButton("Nourrir");
    playBtn = new JButton("Jouer");
    sleepBtn = new JButton("Sieste");
    cleanBtn = new JButton("Laver");

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
  
   


    //Border blueBorder = BorderFactory.createLineBorder(Color.BLUE);

     healthPanel = new NeedPanel(controller.getHealth(),controller.getHealthNaming(),"icon");
     hungerPanel = new NeedPanel(controller.getHunger(),controller.getHungerNaming(),"icon");
     energyPanel = new NeedPanel(controller.getEnergy(),controller.getEnergyNaming(),"icon");
     cleanLinessPanel = new NeedPanel(controller.getCleanliness(),controller.getCleanlinessNaming(),"icon");
     happinessPanel = new NeedPanel(controller.getHappiness(),controller.getHapinessNaming(),"icon");

     hungerCarePanel = new CarePanel(feedBtn);
     energyCarePanel = new CarePanel(sleepBtn);
     cleanlinessCarePanel = new CarePanel(cleanBtn);
     happinessCarePanel = new CarePanel(playBtn);

    JPanel infoPanel = new InfoPanel(controller);
  
    JPanel carePanels[] = {hungerCarePanel, energyCarePanel, cleanlinessCarePanel, happinessCarePanel};
    JPanel needPanels[] = {healthPanel, hungerPanel, energyPanel, cleanLinessPanel, happinessPanel};

    ui = new JPanel();
    ui.setLayout(new BoxLayout(ui,BoxLayout.LINE_AXIS));

  


    needsUI = new JPanel();
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

    needAndCarePanel = new JPanel();
    needAndCarePanel.setLayout(new BoxLayout(needAndCarePanel,BoxLayout.PAGE_AXIS));
    needAndCarePanel.add(needsUI);
    needAndCarePanel.add(careUI);


    tamaPanel.add(infoPanel);
    ui.add(tamaPanel);
    ui.add(needAndCarePanel);
    
    
    frame.getContentPane().add(ui);
    frame.pack();
    frame.setVisible(true);
    frame.repaint();


  
    Runnable viewUpdater = new Runnable(){
      public void run() {
          updateData();
          System.out.println("update" + System.currentTimeMillis());
      }     
    };

    
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    executor.scheduleAtFixedRate(viewUpdater, 0, 5, TimeUnit.SECONDS);

  }


  public void updateData() {
    controller.updateModel();
    updateNeedBars();
    //controller.updateView();
    
    

  }

  public void updateNeedBars()
  {
    healthPanel.updateNeed(controller.getHealth());
    hungerPanel.updateNeed(controller.getHunger());
    energyPanel.updateNeed(controller.getEnergy());
    cleanLinessPanel.updateNeed(controller.getCleanliness());
    happinessPanel.updateNeed(controller.getHappiness());
    frame.repaint();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println(e.getActionCommand());
   
    if(e.getSource()==saveBtn)
    {
      controller.saveGame();
    }

    if(e.getSource()==degradeBtn)
    {
      System.out.println("degradeBTN");
      controller.degrade();
    }

    if(e.getSource()==refreshBtn)
    {
      
      controller.refreshAction();
    }

    if(e.getSource()==feedBtn)
    {
      controller.feedAction();
      hungerPanel.updateNeed(controller.getHunger());
      
    }

    if(e.getSource()==cleanBtn)
    {
      controller.cleanAction();
      cleanLinessPanel.updateNeed(controller.getCleanliness());
    }

    if(e.getSource()==sleepBtn)
    {
      controller.sleepAction();
      energyPanel.updateNeed(controller.getEnergy());
    }

    if(e.getSource()==playBtn)
    {
      controller.playAction();
      happinessPanel.updateNeed(controller.getHappiness());
    }

    updateNeedBars();
    
  }


}
