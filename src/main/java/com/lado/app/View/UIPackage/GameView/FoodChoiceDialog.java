package com.lado.app.View.UIPackage.GameView;

import javax.swing.JComboBox;

import javax.swing.JOptionPane;

public class FoodChoiceDialog {
    
  private boolean isFormValid = false;

  String result = "";
  String[] foodlist = {"...","Poisson","Croquettes","Ecrous","Herbe"};
  final JComboBox < String > combo = new JComboBox < > (foodlist);
  String[] options = {"A Table !"};



    public FoodChoiceDialog()
    {

    }

    
    public String FoodSelect() {
        
   
        String title = "Selection de la nourriture";
   
        while (!isFormValid) {
          JOptionPane.showOptionDialog(null, combo, title,
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
            options, options[0]);
   
          //System.out.println("selection is: " + options[selection]);
   
          Object specie = combo.getSelectedItem();
          if (specie.toString() == "...") {
            JOptionPane.showMessageDialog(null, "Veuillez choisir une nourriture");
          } else {
            isFormValid = true;
            result = specie.toString();
          }
   
        }
        return result;
    }
}


