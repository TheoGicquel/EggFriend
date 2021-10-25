package tests;

import tamagotchiPackage.tamagotchi;
import tamagotchiPackage.species.Sheep;
public class constructTest extends testsSuite{

    void test()
    {
        tamagotchi mouton = new Sheep();
        if(mouton.getName()!="tamagotchi"){fail("tamagotchi","nom par défaut invalide");}

        String myName = "bernardo";
        tamagotchi myMouton = new Sheep(myName);
        if(myMouton.getName()!=myName){fail("sheep(name)","surcharge constructeur incorrecte");}

        
        if(mouton.getIsAlive()!=true){fail("tamagotchi:isAlive","tamagotchi non vivant");}
        if(mouton.getBreed()!="sheep"){fail("tamagotchi:breed","espece invalide");}
        if(mouton.getHealth()!=100){fail("tamagotchi:getHealth","santé initiale invalide");}



        tamagotchi geneTama = new tamagotchi();
        if(geneTama.getBreed()!=null){fail("tamagotchi:breed","espece par défaut invalide");}
    }


}
