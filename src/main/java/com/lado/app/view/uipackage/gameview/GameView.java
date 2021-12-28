package com.lado.app.view.uipackage.gameview;
/**
 * @file GameView.java
 * @author Théo Gicquel
 * Vue principale du jeu dans lequel 
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import com.lado.app.controller.TamagotchiController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GameView implements ActionListener{
  
  /**
   * Evenement qui actualise la vue toutes les 5 secondes,
   * Lié par {@link #initTimer()}
   */
  private final class RunnableImplementation implements Runnable {
    public void run() {
        updateData();
    }
  }



  private TamagotchiController controller;
  private JButton quitBtn;
  private JButton refreshBtn;
  JButton feedBtn;
  JButton playBtn;
  JButton sleepBtn;
  JButton cleanBtn;
  /// 
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

  InfoPanel infoPanel;

  JProgressBar testbar;
  long firsttime=System.currentTimeMillis();

  java.net.URL imageLogoUrl;

  public GameView(){}
  
  
  public GameView(TamagotchiController controller) {
    frame = new JFrame();
    this.controller = controller;
    firsttime= System.currentTimeMillis();

    frame.setTitle("EggFriend -"+controller.getName());


     frame.setSize(400, 400);
     frame.setLocationRelativeTo(null);
     frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     frame.setResizable(true);
     

     imageLogoUrl = getClass().getClassLoader().getResource("images/logo.png");
     if(imageLogoUrl != null)
     {
      ImageIcon appIcon = new ImageIcon(imageLogoUrl);
      frame.setIconImage(appIcon.getImage());
     }
 
    
    Color backgroundColor = new Color(0xa0a0a0);
    frame.getContentPane().setBackground(backgroundColor);

    JLabel nameLbl = new JLabel();
    nameLbl.setText("Name: " + controller.getName());

    nameLbl.setFont(new Font("Arial", Font.BOLD, 14));
    nameLbl.setForeground(Color.WHITE);
    nameLbl.setHorizontalTextPosition(SwingConstants.CENTER);
    nameLbl.setVerticalTextPosition(SwingConstants.TOP);

    frame.add(nameLbl);


     hungerBar = new NeedBar(controller.getHunger());
     healthBar = new NeedBar(controller.getHealth());
     happinessBar = new NeedBar(controller.getHappiness());
     energyBar = new NeedBar(controller.getEnergy());

      feedBtn = new JButton("Nourrir");
    playBtn = new JButton("Jouer");
    sleepBtn = new JButton("Sieste");
    cleanBtn = new JButton("Laver");

    quitBtn = new JButton("Quitter");
    refreshBtn = new JButton("Rafraichir");


    JButton[] careButtons = {feedBtn, playBtn, sleepBtn, cleanBtn};

    JButton[] dataButtons = {quitBtn,refreshBtn};

    for (JButton jButton : careButtons) {
      jButton.addActionListener(this);
    }

    for (JButton jButton : dataButtons) {
      jButton.addActionListener(this);
    }

     healthPanel = new NeedPanel(controller.getHealth(),controller.getHealthNaming());
     hungerPanel = new NeedPanel(controller.getHunger(),controller.getHungerNaming());
     energyPanel = new NeedPanel(controller.getEnergy(),controller.getEnergyNaming());
     cleanLinessPanel = new NeedPanel(controller.getCleanliness(),controller.getCleanlinessNaming());
     happinessPanel = new NeedPanel(controller.getHappiness(),controller.getHappinessNaming());

     hungerCarePanel = new CarePanel(feedBtn);
     energyCarePanel = new CarePanel(sleepBtn);
     cleanlinessCarePanel = new CarePanel(cleanBtn);
     happinessCarePanel = new CarePanel(playBtn);

     infoPanel = new InfoPanel(controller);
  
    JPanel[] carePanels = {hungerCarePanel, energyCarePanel, cleanlinessCarePanel, happinessCarePanel};
    JPanel[] needPanels = {healthPanel, hungerPanel, energyPanel, cleanLinessPanel, happinessPanel};

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
    infoPanel.add(quitBtn);




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


    initTimer();


  }

  public void initTimer()
  {
    Runnable viewUpdater = new RunnableImplementation();
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    executor.scheduleAtFixedRate(viewUpdater, 0, 1, TimeUnit.SECONDS);
  }

  /**
   * Actualise la View avec les informations fournies par le controller
   */
  public void updateData() {
    updateNeedBars();
    updateImage();
    infoPanel.updateMoodLabel();
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

  public void updateImage()
  {
    if(!controller.isTamagotchiAlive())
    {
      infoPanel.revalidate();
      infoPanel.repaint();
      frame.revalidate();
      frame.repaint();

    }

  }



  @Override
  public void actionPerformed(ActionEvent e) {
   
    if(e.getSource()==quitBtn)
    {
      controller.saveGameAction();
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
    
    updateData();
    
  }


}
