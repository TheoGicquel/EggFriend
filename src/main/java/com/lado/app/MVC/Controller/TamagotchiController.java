package com.lado.app.MVC.Controller;

import java.util.EventListener;

import com.lado.app.MVC.Model.Tamagotchi;
import com.lado.app.MVC.View.StartView;
import com.lado.app.MVC.View.TamagotchiView;

public class TamagotchiController{
    private Tamagotchi model;
    private StartView startView;

    public TamagotchiController(Tamagotchi model, TamagotchiView view) {
        this.model = model;
        
    }

    public TamagotchiController()
    {
        this.model = new Tamagotchi();
        
    

        // de cette façon c'est coté controller que tu instancie et lie les controllers à la vue
       // this.startView.frame.newGameButton().addActionListener(new StartButtonListener());
    }

    public static void loadGameAction()
    {

    }

    public void InitializeNewGame(String tamaName, String tamaSpecie)
    {
    model.setName(tamaName);
    model.setSpecie(tamaSpecie);
    }

    
    
}
