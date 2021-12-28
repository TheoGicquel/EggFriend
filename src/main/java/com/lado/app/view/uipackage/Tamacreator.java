package com.lado.app.view.uipackage;
/**
 * @file Tamacreator.java
 * @author Théo Gicquel
 * Créateur de Tamagotchi via menus
 */
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tamacreator {

    
    Tamacreator()
    {
        String[] specieList= {"Chat","Chien","Mouton"};
        JTextField namefield = new JTextField("Nom");
        
        JComboBox<String> specieChoice = new JComboBox<>(specieList);

       
        specieChoice.setEditable(false);


        //create a JOptionPane
        Object[] options = new Object[] {};
        JOptionPane jop = new JOptionPane("Please Select",
                                        JOptionPane.QUESTION_MESSAGE,
                                        JOptionPane.DEFAULT_OPTION,
                                        null,options, null);

        jop.add(specieChoice);
        jop.add(namefield);
        jop.setBounds(0, 0, 200, 200);

        JDialog diag = new JDialog();
        diag.getContentPane().add(jop);
        diag.pack();
        diag.setVisible(true);
    }
}
