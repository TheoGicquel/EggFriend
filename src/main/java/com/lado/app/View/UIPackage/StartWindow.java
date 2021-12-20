package com.lado.app.View.UIPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import com.lado.app.App;
import com.lado.app.Model.GameManager.GameLoader;
import com.lado.app.Model.Tamagotchi.Tamagotchi;

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

    String formProcedure()
    {
            boolean isFormValid = false;
            String result = "";
            String[] specieList = { "...","Chat", "Chien", "Mouton", "Robot" };
            final JComboBox<String> combo = new JComboBox<>(specieList);
      
            String[] options = { "OK"};
      
            String title = "Title";
        
        while(!isFormValid){
            int selection = JOptionPane.showOptionDialog(null, combo, title,
                  JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                  options, options[0]);
      
            
               
               System.out.println("selection is: " + options[selection]);
            
               Object specie = combo.getSelectedItem();
               if(specie.toString() == "...")
               {
                   JOptionPane.showMessageDialog(null, "Veuillez choisir une espèce");
               }
               else
               {
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
           if(getNewGameConfirmation()==0)
           {
               frame.dispose();
               
               // Recuperation nom
               
               String tamaName="";
               while(tamaName.length()<=1){
                tamaName = ">";
                 tamaName = tamaName + JOptionPane.showInputDialog(frame,"Enter Name");   
               }

               tamaName.substring(1);
               
               // choix espece
              
              String tamaSpecie=formProcedure();

               

                System.out.println("TAMA NAME :");
                System.out.println(tamaName);
                System.out.println("TAMA Specie :");
                System.out.println(tamaSpecie);

               GameWindow gameWindow = new GameWindow(tamaName,tamaSpecie);
           }
       } 

       if(e.getSource()==loadGameButton)
       {
           
           try{
                GameLoader loader = new GameLoader(); 
                if(loader.loadingSuccess())
                {
                    
                    Tamagotchi tamaToLoad = loader.loadTamagotchi();
                    GameWindow gameWindow = new GameWindow(tamaToLoad);
                }
                

              }
              catch(Exception ex)
              {
                JOptionPane.showMessageDialog(null, "Erreur lors du chargement de la partie");
           }
           //frame.dispose();

       }
        
    }
}


