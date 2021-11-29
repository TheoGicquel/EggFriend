package com.lado.app;

import com.lado.app.Tamagotchi.Tamagotchi;
import com.lado.app.UIPackage.*;
import javax.swing.JFrame;

/**
 * Hello world!
 */
public class App {

  public App() {}

  public static void main(String[] args) {
    DebugMode debug = new DebugMode();
    Tamagotchi tama = new Tamagotchi();
    debug = new DebugMode(false);
    tama = new Tamagotchi();
    debug.verbose("=== Si vous voyez ceci, vous etes en mode debug !! ===");

    /**
     * Lancer une fenetre permettant de consulter les infos
     * sur le jeu et le tamagotchi
     */
    if (debug.enabled) {
      DebugFrame debugWindow = new DebugFrame();
      debugWindow.loadTama(tama);
    }

    System.out.print("Hello World!");
    // FenetreGraphique fenetre = new FenetreGraphique();
    // fenetre.setVisible(true);
    JFrame gameFrame = new GameFrame(tama);
    gameFrame.setVisible(true);
  }
}
