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
        this.view = view;
    }

    public TamagotchiController()
    {
        this.model = new Tamagotchi();
        this.startView = new StartView();
    

        // de cette façon c'est coté controller que tu instancie et lie les controllers à la vue
       // this.startView.frame.newGameButton().addActionListener(new StartButtonListener());
    }

    public static void loadGameAction()
    {

    }

    
    
}
