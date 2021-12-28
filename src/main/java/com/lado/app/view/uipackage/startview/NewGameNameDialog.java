package com.lado.app.view.uipackage.startview;
/**
 * @file NewGameNameDialog.java
 * @author Théo Gicquel
 * Fenêtre de saisie du nom du nouveau joueur
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewGameNameDialog {
    
    public String get(JFrame frame)
    {
      String response;
      
      response = JOptionPane.showInputDialog(frame,"Nom du Tamagotchi (0-20) :");
      if ((response != null) && (response.length() > 0)) {
        return response;
      }
      else
      {
        return "???";
      }
    }
}
