package tamagotchiPackage;

public class stats extends tamagotchi
{


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
}
