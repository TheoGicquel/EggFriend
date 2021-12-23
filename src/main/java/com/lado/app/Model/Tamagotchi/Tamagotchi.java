package com.lado.app.Model.Tamagotchi;
import java.io.Serializable;
import java.util.List;



/**
 * Classe Model de Tamagotchi
 */
public class Tamagotchi implements Serializable{
      /** Caracteristiques innés ( initialisés a la naissance) */
  private String name;
  private String favoriteFoods[];
  private Specie specie;

  // variables d'instance
   public Need health;
  private boolean alive;
  public Need energy;
  public Need hunger;
  public Need cleanliness;
  public Need happiness;
  private String mood;
  private long lastModifiedTime;
  

  int CRITICAL_THRESHOLD = 10;
  protected Need[] needs = { energy, hunger, cleanliness, happiness };

  public void setDefaultStats() {
    this.alive = true;
    this.name = "Tamago";
    this.setSpecie("unknown");
    this.health = new Need("Vie","Mourrant", 50, 0.01f);
    this.energy = new Need("Energie","Fatigué", 50, 0.01f);
    this.hunger = new Need("Faim","Affamé", 50, 0.03f);
    this.cleanliness = new Need("Proprete","Sale", 50, 0.01f);
    this.happiness = new Need("Bonheur","Déprimé", 50, 0.01f);
    this.health.setCritical(true);
    this.mood = "normal";
    //this.lastModifiedTime = System.currentTimeMillis();
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

  /**
   * @brief Retourne si un des besoins est en état critique
   */
  public Boolean scanCritical() {
    for (Need scannedNeed : needs) {
      if (scannedNeed.getVal() <= CRITICAL_THRESHOLD) {
        return true;
      }
    }
    return false;
  }

  public void depleteNeeds(long timeElapsed) {

    //this.health.calcDepletion(timeElapsed);
    //this.alive.calcDepletion(timeElapsed);
    this.energy.calcDepletion(timeElapsed);
    this.hunger.calcDepletion(timeElapsed);
    this.cleanliness.calcDepletion(timeElapsed);
    this.happiness.calcDepletion(timeElapsed);

    this.updateTime();
  }

  public void update()
  {
    long now = System.currentTimeMillis();
    long elapsedTime = now - lastModifiedTime;
    //System.out.println("update : elapsed time : " + elapsedTime);
    if(elapsedTime > 1000)
    {
      depleteNeeds(elapsedTime);
      checkHealth();
     
    }
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
    
    return "N/A";

  }
  
  // ---------------- VIE -------------
  public int getHealth()
  {
    return this.health.getVal();
  }

  public void setHealth(int newHealth) {
    this.health.setVal(newHealth);
    if (this.health.getVal() == 0) {
      this.setAlive(false);
    }
  }

  public void checkHealth() {
    if (this.getHealth() <= 0) {
      kill();
    } else {
      this.setAlive(alive);
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


    this.setAlive(false);

    this.setCleanliness(0);
    this.setHunger(0);
    this.setHappiness(0);
    this.setEnergy(0);
    this.setHealth(0);
    this.setMood("Mort");

  }

  public boolean getAlive() {
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
    if (this.energy.getVal() == 0) {
      this.setAlive(false);
    }
  }
  
   // ---------------- FAIM -------------
   
   public int getHunger()
   {
     return this.hunger.getVal();
   }

  public void setHunger(int hunger){
    this.hunger.setVal(hunger);
    if (this.hunger.getVal() ==0){
      this.setAlive(false);
    }
  }

  
  // ---------------- PROPRETE -------------

  public int getCleanliness()
  {
    return this.cleanliness.getVal();
  }


  public void setCleanliness(int clean){
    this.cleanliness.setVal(clean);
    if (this.cleanliness.getVal() ==0){
      this.setAlive(false);
    }
  }

  // ---------------- BONNHEUR -------------

  public int getHappiness()
  {
    return this.happiness.getVal();
  }


  public void setHappiness(int newHapinnes){
    this.happiness.setVal(newHapinnes);
    if (this.happiness.getVal() ==0){
      this.setAlive(false);
    }
  }
  

  // ---------------- Humeur -------------


  public void evalMood()
  {
    int lowestNeed = 50;
    String worstMood="N/A";

    if(this.hunger.getVal() < lowestNeed)
    {
      worstMood = this.hunger.getDescriptor();
      lowestNeed = this.cleanliness.getVal();
    }

    if(this.cleanliness.getVal() < lowestNeed)
    {
      worstMood = this.cleanliness.getDescriptor();
      lowestNeed = this.cleanliness.getVal();
    }

    if(this.happiness.getVal() < lowestNeed)
    {
      worstMood = this.happiness.getDescriptor();
      lowestNeed = this.happiness.getVal();
    }

    if(this.energy.getVal() < lowestNeed)
    {
      worstMood = this.energy.getDescriptor();
      lowestNeed = this.energy.getVal();
    }

    if(worstMood!="N/A")
    {
      this.setMood(worstMood);
    }
    else
    {
      this.setMood("NormalA");
    }

  }

public String getMood() {
    return this.mood;
}

public void setMood(String mood) {
    this.mood = mood;
}


}
