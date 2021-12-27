package com.lado.app.controller;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.lado.app.model.gamemanager.GameLoader;
import com.lado.app.model.gamemanager.GameSaver;
import com.lado.app.model.tamagotchi.Tamagotchi;
import com.lado.app.view.uipackage.gameview.FoodChoiceDialog;
import com.lado.app.view.uipackage.gameview.GameView;
import com.lado.app.view.uipackage.startview.NewGameConfirmationDialog;
import com.lado.app.view.uipackage.startview.NewGameNameDialog;
import com.lado.app.view.uipackage.startview.SpecieSelector;

public class TamagotchiController extends TamagotchiBasicController {
    private GameLoader loader;
    private GameSaver saver;
    
    /// Les constantes sont static car partagées entre toutes les instances de la classe
    /// Constantes de satisfaction
    private static final int HUNGR_INCR = 40;
    private static final int CLEAN_INCR = 20;
    private static final int HAPPY_INCR = 40;
    private static final int ENRGY_INCR = 10;

    private static final int ENRGY_DECR = 5; 


    public TamagotchiController(Tamagotchi model) {
        super(model);      
    }

    public TamagotchiController() {
        super(new Tamagotchi());
        
        loader = new GameLoader();
         saver = new GameSaver();


    }

    public void initializeNewGame(String tamaName, String tamaSpecie) {
        model.setModifiedTime(System.currentTimeMillis());
        model.setName(tamaName);
        model.setSpecie(tamaSpecie);
    }

    public void newGame(JFrame frame) {

        NewGameConfirmationDialog confirmation = new NewGameConfirmationDialog();
        if (confirmation.get(frame)) {
            // choix espece
            SpecieSelector selector = new SpecieSelector();
            String tamaSpecie = selector.specieSelect();
            // Recuperation nom
            NewGameNameDialog nameDialog = new NewGameNameDialog();
            String tamaName = nameDialog.get(frame);
            this.initializeNewGame(tamaName, tamaSpecie);
            saver.save(model);
            new GameView(this);
            frame.dispose();

        }
    }

    public void saveGameAction()
    {
        saver.save(model);
        System.exit(0);

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
                new GameView(this);
            }
    }

    public void updateModel() {
        this.model.update();
    }

    public void degrade() {
        model.setHunger(model.getHunger()-10);
        model.setEnergy(model.getEnergy()-10);
        model.setHealth(model.getHealth()-10);
        model.setCleanliness(model.getCleanliness()-10);
        model.setHappiness(model.getHappiness()-10);

        updateModel();

    }

    public void refreshAction() {
        updateModel();

    }

    /**
     * On nourrit le tamagotchi
     * Augmente la satisfaction de faim
     */
    public void feedAction() {
        if(model.isAlive()){
            FoodChoiceDialog foodChoice = new FoodChoiceDialog();
            String chosenFood = foodChoice.foodSelect();
            
            if(chosenFood.equals(model.getFavoriteFood(0)))
            {
                model.setHunger(model.getHunger() + HUNGR_INCR);
                model.setHappiness(model.getHappiness()+ 5);
            }
        }
        updateModel();
    }

    /**
     * On nettoie le tamagotchi
     * Augmente propreté

     */
    public void cleanAction() {
        if(model.isAlive()){
            model.setCleanliness(model.getCleanliness() + CLEAN_INCR);
        }
        updateModel();
    }

    /**
     * On fait dormir le tamagotchi
     * Augmente Energie
     */
    public void sleepAction() {
        if(model.isAlive()){
            model.setEnergy(model.getEnergy() + ENRGY_INCR);
        }
        updateModel();
    }

    /**
     * On joue avec le tamagotchi
     * Augmente bonnheur
     * Descend faim
     * Descend energie
     */
    public void playAction() {
        if(model.isAlive()){
            model.setHappiness(model.getHappiness() + HAPPY_INCR);
            model.setEnergy(model.getEnergy() - ENRGY_DECR);
        }
        updateModel();
    }
}