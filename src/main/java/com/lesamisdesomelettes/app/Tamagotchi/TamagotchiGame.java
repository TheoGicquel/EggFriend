package com.lado.app.Tamagotchi;

import UIPackage.*;

public class TamagotchiGame {

  public static void main(String[] args) {
    FenetreGraphique fenetre = new FenetreGraphique();
    fenetre.setVisible(true);
    Tamagotchi gen = new Tamagotchi("GEN");
    Tamagotchi mouton = new Sheep("monouton");
    System.out.println("tamagotchi generique : " + gen.getName());
    System.out.println("espece : " + gen.getBreed());
    System.out.println("\n\n");
    System.out.println("tamagotchi mouton : " + mouton.getName());
    System.out.println("espece : " + mouton.getBreed());
  }
}
