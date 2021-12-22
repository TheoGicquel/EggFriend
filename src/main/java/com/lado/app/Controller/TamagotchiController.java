package com.lado.app.Controller;




import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.lado.app.Model.GameManager.GameLoader;
import com.lado.app.Model.GameManager.GameSaver;
import com.lado.app.Model.Tamagotchi.Tamagotchi;
import com.lado.app.View.UIPackage.GameView.GameView;
import com.lado.app.View.UIPackage.StartView.NewGameConfirmationDialog;
import com.lado.app.View.UIPackage.StartView.NewGameNameDialog;
import com.lado.app.View.UIPackage.StartView.SpecieSelector;

public class TamagotchiController {
    private Tamagotchi model;
    public int getHunger;
    public Object getCleanlinessNaming;
    private GameLoader loader;
    private GameSaver saver;
    private GameView gameview;

    public TamagotchiController(Tamagotchi model) {
        this.model = model;

    }

    public TamagotchiController() {
        this.model = new Tamagotchi();
        loader = new GameLoader();
         saver = new GameSaver();


    }

    public static void loadGameAction() {

    }

    public void InitializeNewGame(String tamaName, String tamaSpecie) {
        model.setModifiedTime(System.currentTimeMillis());
        model.setName(tamaName);
        model.setSpecie(tamaSpecie);
    }

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

    public void newGame(JFrame frame) {

        NewGameConfirmationDialog confirmation = new NewGameConfirmationDialog();
        if (confirmation.get(frame)) {
            // choix espece
            SpecieSelector selector = new SpecieSelector();
            String tamaSpecie = selector.SpecieSelect();
            // Recuperation nom
            NewGameNameDialog nameDialog = new NewGameNameDialog();
            String tamaName = nameDialog.get(frame);
            this.InitializeNewGame(tamaName, tamaSpecie);
            saver.save(model);
            this.gameview = new GameView(this, false);
            frame.dispose();

        }
    }


    public void saveGame()
    {
        saver.save(model);
    }

    public void loadGame(JFrame frame)
    {
            
            boolean successful = loader.loadingSuccess();
            if(!successful){
                JOptionPane.showMessageDialog(null, "Erreur lors du chargement de la partie");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Chargement de la partie réussi");
                this.model = loader.loadTamagotchi();
                frame.dispose();
                new GameView(this, false);
            }
    }

    public int fetchHunger() {
        return model.getHunger();
    }

    public int fetchEnergy() {
        return model.getEnergy();
    }

    public int fetchHealth() {
        return model.getHealth();
    }

    public int fetchHappiness() {
        return model.getHappiness();
    }

    public int fetchCleanliness() {
        return model.getCleanliness();
    }


    public void updateModel() {
        this.model.update();
    }

    public void feedAction() {
        System.out.println("feed");
        System.out.println(model.getHunger());
        int curhunger = model.getHunger();
        System.out.println(curhunger);

        model.setHunger(curhunger + 10);
        System.out.println("feedAction : " + model.getHunger());
        updateModel();
    }

    public void refreshAction() {
        updateModel();

    }

    public void degrade() {
        model.setHunger(model.getHunger()-10);
        model.setEnergy(model.getEnergy()-10);
        model.setHealth(model.getHealth()-10);
        model.setCleanliness(model.getCleanliness()-10);
        model.setHappiness(model.getHappiness()-10);

        updateModel();

    }

    public void cleanAction() {
        updateModel();

    }

    public void sleepAction() {
        updateModel();
    }

    public void playAction() {
        updateModel();
    }

	public void updateView() {
        gameview.updateData();
	}

    

}

