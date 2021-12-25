package com.lado.app.Controller;

import com.lado.app.Model.Tamagotchi.Tamagotchi;

public class TamagotchiBasicController {
    private Tamagotchi model;

    
    /// Getters et setters appliqués au Tamagotchi
    public int getHapiness() {
        return model.happiness.getVal();
    }

    public int getHunger() {
        return model.hunger.getVal();
    }

    public int getEnergy() {
        return model.energy.getVal();
    }

    public int getHealth() {
        return model.health.getVal();
    }

    public String getHealthNaming() {
        return model.health.getName();
    }

    public String getHungerNaming() {
        return model.hunger.getName();
    }

    public String getEnerggNaming() {
        return model.energy.getName();
    }

    public String getHapinessNaming() {
        return model.happiness.getName();
    }

    public int getCleanliness() {
        return model.cleanliness.getVal();
    }

    public int getHappiness() {
        return model.happiness.getVal();
    }

    public String getCleanlinessNaming() {
        return model.cleanliness.getName();
    }

    public String getEnergyNaming() {
        return model.energy.getName();
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
        return model.getAlive();
    }
}
