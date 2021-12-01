/**
 * Décrivez votre classe Tamagotchi ici.
 *
 * @author (Ryan)
 * @version (13/10/21)
 */

package com.lado.app.Model.Tamagotchi;

import java.io.Serializable;

public class Tamagotchi implements java.io.Serializable{

  /** Caracteristiques innés ( initialisés a la naissance) */
  String name;
  protected String breed;
  String favoriteFoods[];
  //Breed breed; // object ?

  // variables d'instance
  public Need health;
  public boolean alive;
  public Need energy;
  public Need hunger;
  public Need cleanliness;
  public Need happiness;
  public String mood;
  int CRITICAL_THRESHOLD = 5;
  protected Need[] needs = { energy, hunger, cleanliness, happiness };

  public void setDefaultStats() {
    this.alive = true;
    this.name = "Tamago";
    this.breed = "unknown";
    this.health = new Need("Vie", 100, 1.0f);
    this.energy = new Need("Energie", 100, 1.0f);
    this.hunger = new Need("Faim", 100, 1.0f);
    this.cleanliness = new Need("Proprete", 100, 1.0f);
    this.happiness = new Need("Bonnheur", 100, 1.0f);
    this.health.setCritical(true);
    this.mood = "normal";
  }

  public Tamagotchi(String name) {
    setDefaultStats();
    this.name = name;
  }

  public Tamagotchi() {
    setDefaultStats();
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

  public void depleteNeeds(float timeElapsed) {
    for (Need currentNeed : needs) {
      currentNeed.calcDepletion(timeElapsed);
    }
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
  public String getBreed() {
    return this.breed;
  }

  public void setBreed(String newBreed) {
    this.breed = newBreed;
  }

  // -------------- VIE --------------

  public void checkHealth() {
    if (this.health.getVal() <= 0) {
      kill();
    } else {
      setAlive(true);
    }
  }

  public void kill() {
    this.health.setVal(0);
    this.alive = false;
  }

  public void hurt(int damage) {
    int newHealth = this.health.getVal() - damage;
    if (newHealth <= 0) {
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

  public void setHealth(int newHealth) {
    this.health.setVal(newHealth);
    if (this.health.getVal() == 0) {
      this.setAlive(false);
    }
  }

  public boolean getAlive() {
    return this.alive;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }

  public void evalMood() {
    for (Need scannedNeed : needs) {
      if (scannedNeed.getVal() <= 50) {
        this.mood = scannedNeed.getName();
      }
    }
    
  }

public String getMood() {
    return this.mood;
}

public void setMood(String mood) {
    this.mood = mood;
}

}
