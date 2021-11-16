

/**
 * Décrivez votre classe Tamagotchi ici.
 *
 * @author (Ryan)
 * @version (13/10/21)
 */

package tamagotchiPackage;

public class tamagotchi
{
    /** Caracteristiques innés ( initialisés a la naissance) */
    protected String name;
    protected String favoriteFood;
    protected String breed;
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
    public tamagotchi(String name)
    {
        this.name = name;
        this.health=100;
        this.isAlive=true;
        this.energy=100;
        this.hunger=100;
        this.cleanliness=100;
        this.happiness=100;
    }


    public tamagotchi()
    {
        this.name = "tamagotchi";
       // this.favoriteFood="unknown";
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

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setHealth(int newHealth)
    {
        this.health = newHealth;
    }

    public void setIsAlive(boolean alive)
    {
        this.isAlive=false;
    }

    public void checkHealth()
    {
        if(this.getHealth()<=0)
        {
            setIsAlive(false);
        }
        else
        {
            setIsAlive(true);
        }
    }

    public void kill()
    {
        this.setHealth(0);
        this.setIsAlive(false);
    }

    public void hurt(int damage)
    {
        int newHealth = this.getHealth()-damage;
        if(newHealth<=0)
        {
         this.kill();
        }
        else
        {
            this.setHealth(newHealth);
        }
    }

    public void heal(int healValue)
    {
        int newHealth = this.getHealth()+healValue;
        if(newHealth>100)
        {
            newHealth=100;
        }
        this.setHealth(newHealth);
    }




    }
