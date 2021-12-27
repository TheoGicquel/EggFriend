package com.lado.app.view.uipackage.gameview;

import javax.swing.JComboBox;

import javax.swing.JOptionPane;

public class FoodChoiceDialog {
    
  private boolean isFormValid = false;

  String result = "";
  String[] foodlist = {"...","Poisson","Croquettes","Ecrous","Herbe"};
  final JComboBox < String > combo = new JComboBox < > (foodlist);
  String[] options = {"A Table !"};




    
    public String foodSelect() {
        
   
        String title = "Selection de la nourriture";
   
        while (!isFormValid) {
          JOptionPane.showOptionDialog(null, combo, title,
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
            options, options[0]);
   
   
          Object specie = combo.getSelectedItem();
          if (specie.toString().equals("...")) {
            JOptionPane.showMessageDialog(null, "Veuillez choisir une nourriture");
          } else {
            isFormValid = true;
            result = specie.toString();
          }
   
        }
        return result;
    }
}


