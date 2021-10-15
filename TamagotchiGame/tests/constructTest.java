package tests;
import tamagotchiPackage.tamagotchi;
public class constructTest extends testsSuite{

    boolean test()
    {


    
    if(gen.getName()=="GEN")
    tamagotchi mouton = new Sheep("monouton");
    System.out.println("tamagotchi generique : " + gen.getHealth());
    System.out.println("espece : " + gen.getBreed());
    System.out.println("\n\n");
    System.out.println("tamagotchi mouton : " + mouton.getName());
    System.out.println("espece : " + mouton.getBreed());
    }
}
