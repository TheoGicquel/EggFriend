package com.lado.app.controller;
/**
 * @file TamagotchiBasicController.java
 * @author Théo Gicquel
 * Contrôleur de de base du Tamagotchi
 * Définit tous les getters et setters de base
 */
import com.lado.app.model.tamagotchi.Tamagotchi;

public class TamagotchiBasicController {
    Tamagotchi model;

    
    public TamagotchiBasicController(Tamagotchi newModel) {
        this.model = newModel;
    }

    /// Getters  appliqués au Tamagotchi

    public int getHunger() {
        return model.getHunger();
    }

    public int getEnergy() {
        return model.getEnergy();
    }

    public int getHealth() {
        return model.getHealth();
    }

    public int getCleanliness() {
        return model.getCleanliness();
    }

    public int getHappiness() {
        return model.getHappiness();
    }

    public String getHealthNaming() {
        return model.getHealthName();
    }

    public String getHungerNaming() {
        return model.getHungerName();
    }

    public String getEnerggNaming() {
        return model.getEnergyName();
    }

    public String getHappinessNaming() {
        return model.getHappinessName();
    }

    public String getCleanlinessNaming() {
        return model.getCleanlinessName();
    }

    public String getEnergyNaming() {
        return model.getEnergyName();
    }

    public String getSpecie() {
        return model.getSpecie();
    }

    public String getSpecieName() {
        return model.getSpecieText();
    }

    public String getName() {
        return model.getName();
    }

    public String getMood() {
        return model.getMood();
    }

    public boolean isTamagotchiAlive() {
        return model.isAlive();
    }
}
