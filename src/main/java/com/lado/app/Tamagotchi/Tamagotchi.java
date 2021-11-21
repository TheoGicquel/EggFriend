

/**
 * Décrivez votre classe Tamagotchi ici.
 *
 * @author (Ryan)
 * @version (13/10/21)
 */

package com.lado.app.Tamagotchi;

public class Tamagotchi
{
    /** Caracteristiques innés ( initialisés a la naissance) */
    String name;
    protected String breed; 
    String favoriteFood;
    //Breed breed; // object ?

    // variables d'instance
    protected int health;
    protected boolean isAlive;
    protected int energy;
    protected int hunger;
    protected int cleanliness;
    protected int happiness;
    
    
    /**
     * Constructeur d'objets de classe Tamagotchi
     */
    public Tamagotchi(String name)
    {
        // initialisation des variables d'instance
        this.name = name;
        this.breed="unknown";
       // this.breed = breed;

        this.health=100;
        this.isAlive=true;
        this.energy=100;
        this.hunger=100;
        this.cleanliness=100;
        this.happiness=100;
    }



    public String getBreed()
    {
        return this.breed;
    }


    public String getName()
    {
        return this.name;
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
        return this.cleanliness;
    }

    public int getHappiness()
    {
        return this.happiness;
    }




    }
