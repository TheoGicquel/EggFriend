package com.lado.app.view.uipackage.gameview;
/**
 * @file NeedPanel.java
 * @author Théo Gicquel
 * Panneau d'affichage d'une barre de besoins
 * composé de'un JLabel et d'une JProgressBar
 */
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class NeedPanel extends JPanel {

    JProgressBar bar;
    JLabel nameLabel;

    NeedPanel(int inputValue,String buttonString)
    {

       this.nameLabel = new JLabel(buttonString);
        this.bar = new NeedBar(inputValue); 


        this.add(bar);
        this.add(nameLabel);
    }

    void updateNeed(int value)
    {
        this.bar.setValue(value);
        this.bar.setString(value+" %");
    }

    




}
