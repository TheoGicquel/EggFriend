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

    public TamagotchiController(Tamagotchi model) {
        this.model = model;

    }

    public TamagotchiController() {
        this.model = new Tamagotchi();
        loader = new GameLoader();
         saver = new GameSaver();


        // de cette façon c'est coté controller que tu instancie et lie les controllers à la vue
        // this.startView.frame.newGameButton().addActionListener(new StartButtonListener());
    }

    public static void loadGameAction() {

    }

    public void InitializeNewGame(String tamaName, String tamaSpecie) {
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
        return model.health.getName();
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
            new GameView(this, false);
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
                GameView gameView = new GameView(this, false);
            }
    }

}

