package com.lado.app.view.uipackage.startview;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import com.lado.app.controller.TamagotchiController;



public class StartView implements ActionListener{
    private JFrame frame = new JFrame("EggFriend - Accueil");
    JButton newGameButton = new JButton("Nouvelle Partie");
    JButton loadGameButton = new JButton("Charger Partie");
    

    java.net.URL titleImageUrl;
    java.net.URL iconUrl;
    
    TamagotchiController controller;
    public StartView(TamagotchiController controller)
    {
        this.controller = controller;

        frame.setLocationRelativeTo(null);



        newGameButton.setFocusable(false);
        newGameButton.addActionListener(this);
     
        

        loadGameButton.setFocusable(false);
        loadGameButton.addActionListener(this);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.PAGE_AXIS));


        JPanel buttonPanel = new JPanel();

        JPanel titleImagePanel = new JPanel();
        
        // Fetch images location 
        titleImageUrl = getClass().getClassLoader().getResource("images/titleImage.png");
        if(titleImageUrl != null)
        {
          JLabel titleImage = new JLabel(new ImageIcon(titleImageUrl));
            
          titleImagePanel.add(titleImage);
        }
        
        iconUrl = getClass().getClassLoader().getResource("images/logo.png");
        if(iconUrl != null)
        {
        ImageIcon appIcon = new ImageIcon(iconUrl);
        frame.setIconImage(appIcon.getImage());
        }

        
        titleImagePanel.setLayout(new BoxLayout(titleImagePanel,BoxLayout.X_AXIS));


        buttonPanel.add(loadGameButton);
        buttonPanel.add(newGameButton);


        mainPanel.add(titleImagePanel);
        mainPanel.add(buttonPanel);

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setVisible(true);    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==newGameButton)
       {
         controller.newGame(frame);
       }

       if(e.getSource()==loadGameButton)
       {
         controller.loadGame(frame);
       }
        
    }
}


