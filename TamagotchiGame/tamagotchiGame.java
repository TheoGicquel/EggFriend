import tamagotchiPackage.*;
import tamagotchiPackage.species.*;

public class tamagotchiGame {

  public static void main(String[] args) {
    //new debugWindow();
    new tamagotchiUI();
    tamagotchi gen = new tamagotchi("GEN");
    tamagotchi mouton = new Sheep("monMouton");
    System.out.println("tamagotchi generique : " + gen.getName());
    System.out.println("espece : " + gen.getBreed());
    System.out.println("\n\n");
    System.out.println("tamagotchi mouton : " + mouton.getName());
    System.out.println("espece : " + mouton.getBreed());
  }
}
