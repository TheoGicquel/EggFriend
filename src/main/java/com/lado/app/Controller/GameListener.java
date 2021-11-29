package com.lado.app.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ae) {
      // TODO : implémenter les actions des boutons
      System.out.println(ae.getActionCommand());
      
    }
}