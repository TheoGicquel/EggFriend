package com.lado.app.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import com.lado.app.Model.GameModel;


public class GameListener implements ActionListener {



  //public GameListener(Tamagotchi tamagotchi) {}


  public void start(){
  }

    @Override
    public void actionPerformed(ActionEvent ae) {
      String inputText = ae.getActionCommand();      

      /**  !ToDo A completer*/
      System.out.println(inputText);


      
      if(inputText.equals("Manger"))
      {
        //controller.tama.update(Tamagotchi.Action.EAT);
      }

      if(inputText.equals("Maj"))
      {
        GameController.updateTama();
        
      }

      if(inputText.equals("[DEBUG]"))
      {
        GameController.degradeTama();
      }

      GameController.updateView();

    }
}