package com.lado.app.Controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.lado.app.Model.GameManager.GameLoader;
import com.lado.app.Model.GameManager.GameSaver;
import com.lado.app.Model.Tamagotchi.Tamagotchi;
import com.lado.app.View.UIPackage.GameView.FoodChoiceDialog;
import com.lado.app.View.UIPackage.GameView.GameView;
import com.lado.app.View.UIPackage.StartView.NewGameConfirmationDialog;
import com.lado.app.View.UIPackage.StartView.NewGameNameDialog;
import com.lado.app.View.UIPackage.StartView.SpecieSelector;

public class TamagotchiController extends TamagotchiBasicController {
    private GameLoader loader;
    private GameSaver saver;
    private GameView gameview;

    // Constantes de satisfaction
    final int hungerIncrease = 40;
    final int cleanlinessIncrease = 20;
    final int happinessIncrease = 40;
    final int energyIncrease = 10;

    // Constantes de dépense causées par actions
    final int hungerDecrease = 5; 
    final int cleanlinessDecrease = 5; 
    final int happinessDecrease = 7; 
    final int energyDecrease = 5; 


    public TamagotchiController(Tamagotchi model) {
        super(model);      
    }

    public TamagotchiController() {
        super(new Tamagotchi());
        
        loader = new GameLoader();
         saver = new GameSaver();


    }

    public void InitializeNewGame(String tamaName, String tamaSpecie) {
        model.setModifiedTime(System.currentTimeMillis());
        model.setName(tamaName);
        model.setSpecie(tamaSpecie);
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
                new GameView(this, false);
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
        if(model.getAlive()){
            FoodChoiceDialog foodChoice = new FoodChoiceDialog();
            String chosenFood = foodChoice.FoodSelect();
            
            if(chosenFood.equals(model.getFavoriteFood(0)))
            {
                model.setHunger(model.getHunger() + hungerIncrease);
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
        if(model.getAlive()){
            model.setCleanliness(model.getCleanliness() + cleanlinessIncrease);
        }
        updateModel();
    }

    /**
     * On fait dormir le tamagotchi
     * Augmente Energie
     */
    public void sleepAction() {
        if(model.getAlive()){
            model.setEnergy(model.getEnergy() + energyIncrease);
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
        if(model.getAlive()){
            model.setHappiness(model.getHappiness() + happinessIncrease);
            model.setEnergy(model.getEnergy() - energyDecrease);
        }
        updateModel();
    }
}