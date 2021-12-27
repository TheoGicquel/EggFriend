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
        if(model.getAlive()){
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
        if(model.getAlive()){
            model.setCleanliness(model.getCleanliness() + CLEAN_INCR);
        }
        updateModel();
    }

    /**
     * On fait dormir le tamagotchi
     * Augmente Energie
     */
    public void sleepAction() {
        if(model.getAlive()){
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
        if(model.getAlive()){
            model.setHappiness(model.getHappiness() + HAPPY_INCR);
            model.setEnergy(model.getEnergy() - ENRGY_DECR);
        }
        updateModel();
    }
}