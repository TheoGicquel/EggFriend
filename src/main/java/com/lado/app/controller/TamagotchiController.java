package com.lado.app.controller;
/**
 * @file TamagotchiController.java
 * @author Théo Gicquel
 * Contrôleur de l'application
 * Définit les actions possible entre la vue et le modèle
 */
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
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
import java.util.concurrent.ScheduledExecutorService;

public class TamagotchiController extends TamagotchiBasicController {
    private GameLoader loader;
    private GameSaver saver;
    
    public TamagotchiController(Tamagotchi model) {
        super(model); 
    }

    public TamagotchiController() {
        super(new Tamagotchi());
        
        loader = new GameLoader();
         saver = new GameSaver();

    }

  /**
   * Evenement qui actualise la vue toutes les 5 secondes,
   * Lié par {@link #initTimer()}
   */
  private final class RunnableImplementation implements Runnable {
    public void run() {
        updateModel();
    }
  }

    public void needTimerInit()
    {
      Runnable needTimer = new RunnableImplementation();
      ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
      executor.scheduleAtFixedRate(needTimer, 0, 1, TimeUnit.SECONDS);
    }


    public void initializeNewGame(String tamaName, String tamaSpecie) {
        model.setModifiedTime(System.currentTimeMillis());
        model.setName(tamaName);
        model.setSpecie(tamaSpecie);
        needTimerInit();
    }

    public void newGame(JFrame frame) {

        NewGameConfirmationDialog confirmation = new NewGameConfirmationDialog();
        if (confirmation.get(frame)) {
            // choix espece
            SpecieSelector selector = new SpecieSelector();
            String tamaSpecie = selector.specieSelect();
            // Recuperation nom
            String tamaName="";
            while (tamaName.length() == 0 || tamaName.length() > 20) {
                NewGameNameDialog nameDialog = new NewGameNameDialog();
                tamaName = nameDialog.get(frame);
            }
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
                needTimerInit();
                updateModel();
                frame.dispose();
                new GameView(this);
            }
    }

    public void updateModel() {
        this.model.update();
    }


    /**
     * On nourrit le tamagotchi
     * Augmente la satisfaction de faim
     */
    public void feedAction() {
        if(model.isAlive()){
            FoodChoiceDialog foodChoice = new FoodChoiceDialog();
            String chosenFood = foodChoice.foodSelect();

                if(chosenFood.equals(model.getFavoriteFood(0))||chosenFood.equals(model.getFavoriteFood(1)))
                {
                    model.setHunger(model.getHunger() + 40);
                    model.setHappiness(model.getHappiness()+ 5);
                }
            }
    }

    /**
     * On nettoie le tamagotchi
     * Augmente propreté
     * Baisse le bonheur
     */
    public void cleanAction() {
        if(model.isAlive()){
            model.setCleanliness(model.getCleanliness() + 40);
            model.setHappiness(model.getHappiness()-5);
        }
    }

    /**
     * On fait dormir le tamagotchi
     * Augmente Energie
     * Baisse Bonnheur
     */
    public void sleepAction() {
        if(model.isAlive()){
            model.setEnergy(model.getEnergy() + 50);
            model.setHappiness(model.getHappiness()+5);
        }
    }

    /**
     * On joue avec le tamagotchi
     * Augmente bonnheur
     * Descend faim
     * Descend energie
     */
    public void playAction() {
        if(model.isAlive()){
            model.setHappiness(model.getHappiness() + 40);
            model.setEnergy(model.getEnergy() - 20);
            model.setHunger(model.getHunger() - 10);
        }
    }
}