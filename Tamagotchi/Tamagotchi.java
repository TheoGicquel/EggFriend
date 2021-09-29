
/**
 * Décrivez votre classe tamagochi ici.
 *
 * @author (votre nom)
 * @version 0.0.1
 */
public class Tamagotchi
{
    /** Caracteristiques innés ( initialisés a la naissance) */
    String name;
    Breed breed; // object ?

    // variables d'instance
    private int health;
    private boolean isAlive;
    private int energy;
    private int hunger;
    private int cleanliness;
    private int happiness;
    

    /**
     * Constructeur d'objets de classe tamagochi
     */
    public Tamagotchi(String name, Breed breed)
    {
        // initialisation des variables d'instance
        this.name = name;
        this.breed = breed;

        this.health=100;
        this.isAlive=true;
        this.energy=100;
        this.hunger=100;
        this.cleanliness=100;
        this.happiness=100;
    }



    public int getHealth()
    {
        return this.health;
    }

    public boolean getIsAlive()
    {
        return this.isAlive;
    }

    public int getEnergy()
    {
        return this.energy;
    }


    public int getHunger()
    {
        return this.hunger;
    }

    public int getCleanliness()
    {
        return this.hunger;
    }

    public int getHappiness()
    {
        return this.happiness;
    }




}
