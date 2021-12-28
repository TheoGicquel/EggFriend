package com.lado.app.view.uipackage.startview;
/**
 * @file specieSelector.java
 * @author Théo Gicquel
 * Classe de fenêtre de choix de l'espèce du nouveau Tamagotchi
 */
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class SpecieSelector {
  private boolean isFormValid = false;

  String result = "";
  String[] specieList = {"...","Chat","Chien","Mouton","Robot"};
  final JComboBox < String > combo = new JComboBox < > (specieList);
  String[] options = {"Ok"};





    
    public String specieSelect() {
        
   
        String title = "Selection de l'espèce";
   
        while (!isFormValid) {
          JOptionPane.showOptionDialog(null, combo, title,
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
            options, options[0]);
      
          Object specie = combo.getSelectedItem();
          if (specie.toString().equals("...")) {
            JOptionPane.showMessageDialog(null, "Veuillez choisir une espèce");
          } else {
            isFormValid = true;
            result = specie.toString();
          }
   
        }
        return result;
    }
}
