package com.lado.app.view.uipackage.gameview;
/**
 * @file NeedBar.java
 * @author Théo Gicquel
 * @author Corentin Quiniou
 * Description de la barre de besoins
 * @see GameView
 */
import javax.swing.JProgressBar;
import java.awt.Color;
/** 
* JProgressbar avec couleur prédéfinie
* Utilisé par {@link #GameView}
*/
public class NeedBar extends JProgressBar{
    NeedBar(int input)
    {
        this.setBounds(300, 190, 560, 30);
        this.setForeground(new Color(46, 204, 113));//green
        this.setStringPainted(true);
        this.setValue(input);   
    }
    

}
