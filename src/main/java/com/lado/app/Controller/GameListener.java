package com.lado.app.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.lado.app.Model.GameModel;
import com.lado.app.Model.Tamagotchi.Tamagotchi;


public class GameListener implements ActionListener {



  private GameModel gModel;

  public GameListener(Tamagotchi tamagotchi) {
  
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

    }
}