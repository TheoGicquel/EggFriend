package com.lado.app.View.UIPackage.StartView;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewGameConfirmationDialog {

    public boolean get(JFrame frame) {
            int n = JOptionPane.showConfirmDialog(
                frame,
                "Souhaitez-vous vraiment créer une nouvelle partie ?\n Votre ancienne partie sera écrasée",
                "Confirmation de nouvelle partie",
                JOptionPane.YES_NO_OPTION);
    
                //System.out.println("N FORM :");
                //System.out.println(n);
                if(n==0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
    
        }
    
    }

