package com.lado.app.View.UIPackage;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import com.lado.app.Controller.TamagotchiController;
import com.lado.app.Model.GameManager.GameLoader;

import java.awt.Color;


public class StartView implements ActionListener{
    public JFrame frame = new JFrame("TamagotchiGame - Accueil");
    JButton newGameButton = new JButton("Nouvelle Partie");
    JButton loadGameButton = new JButton("Charger Partie");
    ImageIcon appIcon = new ImageIcon("src/main/resources/images/logo.png");
    TamagotchiController model;
    public StartView()
    {
        model = new TamagotchiController();
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


    boolean getNewGameConfirmation()
    {

        int n = JOptionPane.showConfirmDialog(
            frame,
            "Souhaitez-vous vraiment créer une nouvelle partie ?\n Votre ancienne partie sera écrasée",
            "Confirmation de nouvelle partie",
            JOptionPane.YES_NO_OPTION);

            System.out.println("N FORM :");
            System.out.println(n);
            if(n==0)
            {
                return true;
            }
            else
            {
                return false;
            }

    }

    String SpecieSelector() {
        boolean isFormValid = false;
        String result = "";
        String[] specieList = {
          "...",
          "Chat",
          "Chien",
          "Mouton",
          "Robot"
        };
        final JComboBox < String > combo = new JComboBox < > (specieList);
   
        String[] options = {
          "OK"
        };
   
        String title = "Title";
   
        while (!isFormValid) {
          int selection = JOptionPane.showOptionDialog(null, combo, title,
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
            options, options[0]);
   
          System.out.println("selection is: " + options[selection]);
   
          Object specie = combo.getSelectedItem();
          if (specie.toString() == "...") {
            JOptionPane.showMessageDialog(null, "Veuillez choisir une espèce");
          } else {
            isFormValid = true;
            result = specie.toString();
          }
   
        }
        return result;
   
      }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==newGameButton)
       {
          
           if(getNewGameConfirmation()==true)
           {
               
               
               // Recuperation nom
               
               String tamaName="";
               while(tamaName.length()<=1){
                tamaName = ">";
                 tamaName = tamaName + JOptionPane.showInputDialog(frame,"Nom du Tamagotchi :");   
               }

               tamaName.substring(1);
               
               // choix espece
              
              String tamaSpecie=SpecieSelector();

               

                System.out.println("TAMA NAME :");
                System.out.println(tamaName);
                System.out.println("TAMA Specie :");
                System.out.println(tamaSpecie);

                model.InitializeNewGame(tamaName,tamaSpecie);
                GameFrame gameFrame = new GameFrame(model,false);
                frame.dispose();

           }
       }

       if(e.getSource()==loadGameButton)
       {
        try{
            GameLoader loader = new GameLoader();
            if(loader.loadingSuccess())
            {
              TamagotchiController.loadGameAction();
              frame.dispose();
              GameView gameView = new GameView(model, false);

            }
          }
          catch(Exception ex)
              {
                JOptionPane.showMessageDialog(null, "Erreur lors du chargement de la partie");
           }
            

       }


        
    }
}


