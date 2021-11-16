import SystemPackage.SystemManager;
import tamagotchiPackage.*;
//import tamagotchiPackage.main;
import tamagotchiPackage.species.*;

public class tamagotchiGame {

  public static void main(String[] args) {
   // FenetreGraphique fenetre = new FenetreGraphique();
	//	fenetre.setVisible(true);
    tamagotchi gen = new tamagotchi("GEN");
    tamagotchi mouton = new Sheep("monouton");
    System.out.println("tamagotchi generique : " + gen.getHealth());
    System.out.println("espece : " + gen.getBreed());
    System.out.println("\n\n");
    System.out.println("tamagotchi mouton : " + mouton.getName());
    System.out.println("espece : " + mouton.getBreed());
    SystemManager sys = new SystemManager();
   // sys.savegame.save();
   // sys.savegame.create();

   // sys.savegame.create();
    
  }
}
