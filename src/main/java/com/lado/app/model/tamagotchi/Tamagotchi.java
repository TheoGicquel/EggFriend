package com.lado.app.model.tamagotchi;
/**
 * @file Tamagotchi.java
 * @author Théo Gicquel
 * 
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe Model de Tamagotchi
 */
public class Tamagotchi implements Serializable{
      /** Caracteristiques innés ( initialisés a la naissance) */
  private String name;
  private String[] favoriteFoods;
  private Specie specie;

  // variables d'instance
  private Need health;
  private boolean alive;
  private Need energy;
  private Need hunger;
  private Need cleanliness;
  private Need happiness;
  private String mood;
  private long lastModifiedTime;
  Need[] needs = { energy, hunger, cleanliness, happiness };
  public static final int LOW_NEED_THRESH = 35;
  // create list of needs
  private List<Need> needsList;
  public void setDefaultStats() {
    this.alive = true;
    this.name = "Tamago";
    this.setSpecie("unknown");
    this.health = new Need("Vie","Mourrant", 50, 0.05f);
    this.energy = new Need("Energie","Fatigué", 50, 0.07f);
    this.hunger = new Need("Faim","Affamé", 50, 0.08f);
    this.cleanliness = new Need("Proprete","Sale", 50, 0.06f);
    this.happiness = new Need("Bonheur","Déprimé", 50, 0.05f);
    this.health.setCritical(true);
    this.mood = "normal";
    needsList = new ArrayList<>();
    this.needsList.add(health);
    this.needsList.add(energy);
    this.needsList.add(hunger);
    this.needsList.add(cleanliness);
    this.needsList.add(happiness);
  }



  public Tamagotchi() {
    this.specie = new Specie("unknown");
    setDefaultStats();
  }


  public List<String> getFoods()
  {
    return specie.getFavoriteFoods();
  }


  /**
   * retourne le n ieme element de la liste
   * Exemple : Premier element -> getFood(1);
   * @param index
   * @return
   */
  public String getFood(int index)
  {
    return specie.getFavoriteFood(index);
  }


  public Need[] getNeedArray()
  {
    return needs;
  }

  // -------------- ATTRIBUTS --------------



  public void depleteNeeds(long timeElapsed) {
    int secondElapsed = (int) (timeElapsed / 1000);
    /// !IMPORTANT : nombres de secondes qui déclenchent la maj de la valeur du besoin
    if(secondElapsed > 60)
    {
    this.energy.calcDepletion(secondElapsed);
    this.hunger.calcDepletion(secondElapsed);
    this.cleanliness.calcDepletion(secondElapsed);
    this.happiness.calcDepletion(secondElapsed);
    evalHealth();
    checkHealth();
    this.updateTime();

    }
  }

  public void update()
  {
    long now = System.currentTimeMillis();
    long elapsedTime = now - lastModifiedTime;

      depleteNeeds(elapsedTime);
      
      evalMood();
      
     
    }



  public long getModifiedTime()
  {
    return lastModifiedTime;
  }
  
  public void setModifiedTime(long time)
  {
    this.lastModifiedTime = time;
  }
  
  public void updateTime()
  {
    this.lastModifiedTime = System.currentTimeMillis();
  }
  
  



  // -------------- NOM  --------------
  /**
   * @return nom du Tamagotchi
   */
  public String getName() {
    return this.name;
  }

  /**
   * @brief Modifie le nom du Tamagotchi
   */
  public void setName(String newName) {
    this.name = newName;
  }
  

  // -------------- ESPECE --------------

  /**
   * @return Espece du Tamagotchi
   */
  public String getSpecie()
  {
    return this.specie.getName();
  }

  public void setSpecie(String newSpecie)
  {
    this.specie.initialize(newSpecie);
  }

  public String getSpecieText()
  {
    return this.specie.getText();
  }

  // ----- NOURITTURE FAVORITE ------
  
  public String[] getFavoriteFoods(){


    return this.favoriteFoods;
  }


  public String getFavoriteFood(int index){
    return this.specie.getFavoriteFood(index);
  }
  
  // ---------------- VIE -------------
  public int getHealth()
  {
    return this.health.getVal();
  }

  public String getHealthName()
  {
    return this.health.getName();
  }

  public void setHealth(int newHealth) {
    if (this.health.getVal() != 0) {
      this.health.setVal(newHealth);
    }
  }

  /**
   * si la vie du tamagotchi est superieure a 0, il reste vivant, sinon il meurt
   */
  public void checkHealth() {
    this.setAlive(this.getHealth() > 0);
  }

  /**
   * @brief Modifie la vie du Tamagotchi selon si 
   * les besoins sont en dessous de leur valeur de danger
   */
  public void evalHealth()
  {
    if(needsList!=null)
    {
      boolean isOkay = true;
    for (Need n : needsList)
    {
      if(n.isBelowCritical())
      {
        this.hurt(2);
        isOkay = false;
      }
    }
    if(isOkay)
    {
      this.heal(10);
    }
  }
  }


  public void hurt(int damage) {
    int newHealth = this.health.getVal() - damage;
    if (newHealth <= 0) {
      this.setHealth(0);
      this.kill();
    } else {
      this.setHealth(newHealth);
    }
  }

  public void heal(int healValue) {
    int newHealth = this.health.getVal() + healValue;
    if (newHealth > 100) {
      newHealth = 100;
    }
    this.setHealth(newHealth);
  }


  public void kill() {
    if(this.alive){
    this.setAlive(false);

    this.setCleanliness(0);
    this.setHunger(0);
    this.setHappiness(0);
    this.setEnergy(0);
    this.setHealth(0);
    this.setMood("Mort");
    }
  }

  public boolean isAlive() {
    return this.alive;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }




  // ---------------- VIE -------------

  public int getEnergy()
  {
    return this.energy.getVal();
  }

  public void setEnergy(int energy){
      this.energy.setVal(energy);
  }
  
   // ---------------- FAIM -------------
   
   public int getHunger()
   {
     return this.hunger.getVal();
   }

  public void setHunger(int hunger){
    this.hunger.setVal(hunger);
  }

  
  // ---------------- PROPRETE -------------

  public int getCleanliness()
  {
    return this.cleanliness.getVal();
  }


  public void setCleanliness(int clean){
    this.cleanliness.setVal(clean);
  }

  // ---------------- BONNHEUR -------------

  public int getHappiness()
  {
    return this.happiness.getVal();
  }


  public void setHappiness(int newHapinnes){
    this.happiness.setVal(newHapinnes);

  }
  

  // ---------------- Humeur -------------

  /**
   * Evalue le besoin le plus bas du Tamagotchi et l'applique a son Humeur
   */
  public void evalMood() {
    boolean changed = false;
    String worstMood = "ERR";
    int lowestRecordedValue = LOW_NEED_THRESH;
    if (needsList != null)
    {
      for (Need n: needsList)
      {
        if (n.getVal() < lowestRecordedValue)
        {
          lowestRecordedValue = n.getVal();
          worstMood = n.getDescriptor();
          changed = true;
        }
      }
    if(changed)
    {
      this.setMood(worstMood);
    }
    else
    {
      this.setMood("Normal");
    }
  }
}

public String getMood() {
    return this.mood;
}

public void setMood(String mood) {
    this.mood = mood;
}



public String getHungerName() {
  return hunger.getName();
}



public String getEnergyName() {
    return energy.getName();
}



public String getHappinessName() {
    return happiness.getName();
}



public String getCleanlinessName() {
    return cleanliness.getName();
}


}
