package com.lado.app.View.UIPackage.StartView;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import com.lado.app.Controller.TamagotchiController;

import java.awt.Color;


public class StartView implements ActionListener{
    public JFrame frame = new JFrame("TamagotchiGame - Accueil");
    JButton newGameButton = new JButton("Nouvelle Partie");
    JButton loadGameButton = new JButton("Charger Partie");
    ImageIcon appIcon = new ImageIcon("src/main/resources/images/logo.png");
    TamagotchiController controller;
    public StartView()
    {
        controller = new TamagotchiController();
        //Border blackline = BorderFactory.createLineBorder(Color.black);
        Border blueLine = BorderFactory.createLineBorder(Color.blue);
        Border redLine = BorderFactory.createLineBorder(Color.red);
     //   Border buttonBorder = new EmptyBorder(10,40,10,20);
        frame.setLocationRelativeTo(null);


        //newGameButton.setBounds(100,100,200,40);
       // newGameButton.setBorder(buttonBorder);
        newGameButton.setFocusable(false);
        newGameButton.addActionListener(this);
     
        
        //loadGameButton.setBounds(200,100,200,40);
        //loadGameButton.setBorder(buttonBorder);
        loadGameButton.setFocusable(false);
        loadGameButton.addActionListener(this);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.PAGE_AXIS));


        JPanel buttonPanel = new JPanel();
        
        //buttonPanel.setLayout(new );

        JPanel titleImagePanel = new JPanel();
        titleImagePanel.setLayout(new BoxLayout(titleImagePanel,BoxLayout.X_AXIS));

        String titleImagePath = "src/main/resources/titleImage.png";

        JLabel titleImage = new JLabel( new ImageIcon(titleImagePath) );

        //titleImage.setBounds(0, 0, 10, 10);

        titleImagePanel.add(titleImage);


        buttonPanel.setBorder(blueLine);


        buttonPanel.add(loadGameButton);
        buttonPanel.add(newGameButton);

        mainPanel.setBorder(redLine);

        mainPanel.add(titleImagePanel);
        mainPanel.add(buttonPanel);

      

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //buttonPanel.setBounds(0,0,300,300);
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


