package com.lado.app.Controller;

import com.lado.app.Model.Tamagotchi.Tamagotchi;

public class TamagotchiBasicController {
    Tamagotchi model;

    
    public TamagotchiBasicController(Tamagotchi newModel) {
        this.model = newModel;
    }

    /// Getters et setters appliqués au Tamagotchi
    public int getHapiness() {
        return model.getHappiness();
    }

    public int getHunger() {
        return model.getHunger();
    }

    public int getEnergy() {
        return model.getEnergy();
    }

    public int getHealth() {
        return model.getHealth();
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

    public String getHapinessNaming() {
        return model.getHappinessName();
    }

    public int getCleanliness() {
        return model.getCleanliness();
    }

    public int getHappiness() {
        return model.getHappiness();
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
        return model.getAlive();
    }
}
