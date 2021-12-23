package com.lado.app.View.UIPackage.StartView;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class SpecieSelector {
  private boolean isFormValid = false;

  String result = "";
  String[] specieList = {"...","Chat","Chien","Mouton","Robot"};
  final JComboBox < String > combo = new JComboBox < > (specieList);
  String[] options = {"Ok"};



    public SpecieSelector()
    {

    }

    
    public String SpecieSelect() {
        
   
        String title = "Title";
   
        while (!isFormValid) {
          int selection = JOptionPane.showOptionDialog(null, combo, title,
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
            options, options[0]);
   
          //System.out.println("selection is: " + options[selection]);
   
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
}
