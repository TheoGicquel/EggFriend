package com.lado.app.model.gamemanager;
import java.time.LocalDateTime; 

public class GameTimer {
   LocalDateTime currentTime;
   LocalDateTime savedTime;

   GameTimer()
   {
       updateCurrentTime();
   }

   void updateCurrentTime()
   {
    currentTime= LocalDateTime.now();
   }

   public float getTimeDifference(){
       return 4.2f;
   }
    
}
