package com.lado.app.View.UIPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import com.lado.app.App;

import java.awt.Color;
import java.awt.Insets;


public class StartWindow implements ActionListener{
    JFrame frame = new JFrame("TamagotchiGame - Accueil");
    JButton newGameButton = new JButton("Nouvelle Partie");
    JButton loadGameButton = new JButton("Charger Partie");
    ImageIcon appIcon = new ImageIcon("src/main/resources/images/logo.png");

    public StartWindow()
    {
        Border blackline = BorderFactory.createLineBorder(Color.black);
        Border blueLine = BorderFactory.createLineBorder(Color.blue);
        Border redLine = BorderFactory.createLineBorder(Color.red);
        Border buttonBorder = new EmptyBorder(10,40,10,20);


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


    int getNewGameConfirmation()
    {

        int n = JOptionPane.showConfirmDialog(
            frame,
            "Souhaitez-vous vraiment créer une nouvelle partie ?\n Votre ancienne partie sera écrasée",
            "Confirmation de nouvelle partie",
            JOptionPane.YES_NO_OPTION);


            return n;

    }

//If you're here, the return value was null/empty.
//setLabel("Come on, finish the sentence!");
    








    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==newGameButton)
       {
           if(getNewGameConfirmation()==0)
           {
               frame.dispose();
                
               GameWindow gameWindow = new GameWindow();
           }
       } 

       if(e.getSource()==loadGameButton)
       {
           frame.dispose();
           JOptionPane.showMessageDialog(null, "Veuillez Sélectionner une espèce", "Erreur de sélection", JOptionPane.NO_OPTION);

       }
        
    }
}


