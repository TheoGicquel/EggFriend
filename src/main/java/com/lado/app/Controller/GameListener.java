package com.lado.app.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;

import com.lado.app.Model.GameModel;
import com.lado.app.Model.Tamagotchi.Tamagotchi;
import com.lado.app.View.GameView;


public class GameListener implements ActionListener {

  private String lastInput;
  private Tamagotchi tamagotchi;
 // private GameModel model;
  private GameView view;


  public GameListener(GameModel gameModel, GameView gameView) {
    //
  }

  public GameListener(GameModel gameModel) {

  
  }

  public GameListener(Tamagotchi tamagotchi) {}


  public void start(){
    this.lastInput = "NONE";
  }

    @Override
    public void actionPerformed(ActionEvent ae) {
      String inputText = ae.getActionCommand();      

      // TODO A completer
      System.out.println(inputText);


      
      if(inputText.equals("Manger"))
      {
        //controller.tama.update(Tamagotchi.Action.EAT);
      }

      if(inputText.equals("[DEBUG]"))
      {
        GameController.debug();
      }

      if(inputText.equals("Maj"))
      {
        
        GameController.updateTama();
      }

      if(inputText.equals("[DEBUG]"))
      {
        GameController.updateTama();

        GameController.degradeTama();
      }

      GameController.updateView();

    }
}