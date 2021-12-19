package com.lado.app.View.UIPackage;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class TamaCreator {

    
    TamaCreator()
    {
        String[] specieList= {"Chat","Chien","Mouton"};
        JTextField namefield = new JTextField("Nom");
        
        JComboBox specieChoice = new JComboBox(specieList);

       
        specieChoice.setEditable(false);


        //create a JOptionPane
        Object[] options = new Object[] {};
        JOptionPane jop = new JOptionPane("Please Select",
                                        JOptionPane.QUESTION_MESSAGE,
                                        JOptionPane.DEFAULT_OPTION,
                                        null,options, null);

        //add combos to JOptionPane
        jop.add(specieChoice);
        jop.add(namefield);
        jop.setBounds(0, 0, 200, 200);

        //create a JDialog and add JOptionPane to it 
        JDialog diag = new JDialog();
        diag.getContentPane().add(jop);
        diag.pack();
        diag.setVisible(true);
    }
}
