package com.lado.app.View.UIPackage;

import java.awt.*;
import javax.swing.*;

public class FenetreGraphique extends JFrame {

  ContenuFenetre panel;

  public FenetreGraphique() {
    // super();
    proprietesFenetre();
  }

  private void proprietesFenetre() {
    //Paramètres de la fenêtre
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //paramètre par default de fermeture du logiciel.
    this.setSize(1000, 600);
    this.setResizable(false); //Permet de ne pas redimensionner la fenêtre.
    this.setBackground(Color.black);
    this.setLocationRelativeTo(null); //Positionne la fenêtre au centre de l'écran.
    this.setAlwaysOnTop(true); //Permet de toujours garder la fenêtre au premier plan devant d'autres logiciels.
    panel = new ContenuFenetre();
    this.setContentPane(panel);
  }
}
