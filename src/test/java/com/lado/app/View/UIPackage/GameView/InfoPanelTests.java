package com.lado.app.view.uipackage.gameview;
import static org.junit.Assert.*;

import com.lado.app.controller.TamagotchiController;
import com.lado.app.model.tamagotchi.Tamagotchi;

import org.junit.Test;
public class InfoPanelTests {
    @Test
    public void TestDefaultInfoMoodLabel(){
      TamagotchiController controller = new TamagotchiController();
     InfoPanel infoPanel = new InfoPanel(controller);
      assertEquals("Statut :   normal",infoPanel.moodLabel.getText());

    }

    @Test
    public void TestDeadInfoMoodLabel(){
      Tamagotchi tamatest = new Tamagotchi();
      tamatest.kill();
        TamagotchiController controller = new TamagotchiController(tamatest);
      
     InfoPanel infoPanel = new InfoPanel(controller);
      assertEquals("Statut :   Mort",infoPanel.moodLabel.getText());

    }

}
