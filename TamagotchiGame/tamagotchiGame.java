import tamagotchi.*;
import tamagotchi.species.*;

public class tamagotchiGame
{

	public static void main(String[] args){
        Tamagotchi gen = new Tamagotchi("GEN");

        Tamagotchi mouton = new Sheep("monMouton");

        System.out.println("tamagotchi generique : " + gen.getName());
        System.out.println("espece : " + gen.getBreed());

        System.out.println("\n\n");


        System.out.println("tamagotchi mouton : " + mouton.getName());
        System.out.println("espece : " + mouton.getBreed());
        

	}

}