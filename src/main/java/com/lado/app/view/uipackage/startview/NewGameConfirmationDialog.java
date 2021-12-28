package com.lado.app.view.uipackage.startview;
/**
 * @file NewGameNameDialog.java
 * @author Théo Gicquel
 * Dialogue de confirmation de nouvelle partie
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewGameConfirmationDialog {

    public boolean get(JFrame frame) {
            int n = JOptionPane.showConfirmDialog(
                frame,
                "Souhaitez-vous vraiment créer une nouvelle partie ?\n Votre ancienne partie sera écrasée",
                "Confirmation de nouvelle partie",
                JOptionPane.YES_NO_OPTION);
                return(n==0);    
        }
    
    }

