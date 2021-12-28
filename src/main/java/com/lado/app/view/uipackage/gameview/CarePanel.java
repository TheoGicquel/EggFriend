package com.lado.app.view.uipackage.gameview;
/**
 * @file CarePanel.java
 * @author Théo Gicquel
 * Panneau possédant un bouton satisfaisant un besoin
 */
import javax.swing.JButton;
import javax.swing.JPanel;

public class CarePanel extends JPanel{
    CarePanel(JButton careButton)
    {
        this.add(careButton);        
    }
}
