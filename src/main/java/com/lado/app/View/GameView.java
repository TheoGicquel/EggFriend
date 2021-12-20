package com.lado.app.View;
import javax.swing.JFrame;
import com.lado.app.Model.GameModel;
import com.lado.app.Model.Tamagotchi.Tamagotchi;
import com.lado.app.View.UIPackage.GameFrame;

public class GameView {

    
    //DebugMode debug = new DebugMode();
    Tamagotchi tamagotchi = new Tamagotchi();
    JFrame gameFrame;

       // FenetreGraphique fenetre = new FenetreGraphique();
    // fenetre.setVisible(true);
   

    public GameView(GameModel model)
    {
        
        tamagotchi = model.tamagotchi;
       // JFrame gameFrame = new GameFrame(tamagotchi);

        gameFrame.setVisible(true);

    }


    public void update() {
    }


    public void updateView() {
        // TODO 
    }
}
