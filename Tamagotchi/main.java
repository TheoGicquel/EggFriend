import species.*;
import species.Tamagotchi;

public class main{

	public static void main(String[] args){
        Tamagotchi gen = new Tamagotchi("GEN");
        Tamagotchi mouton = new Sheep("w");

        System.out.println("tamagotchi generique : " + gen.name);
        System.out.println("espece : " + gen.breed);

        System.out.println("\n\n");


        System.out.println("tamagotchi mouton : " + mouton.name);
        System.out.println("espece : " + mouton.breed);
        

	}

}