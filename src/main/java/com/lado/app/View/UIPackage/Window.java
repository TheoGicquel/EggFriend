package com.lado.app.View.UIPackage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public abstract class Window extends JFrame {





    void initialize() {
     
        this.setSize(400, 400);
        this.setTitle("TITRE FENETRE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon appIcon = new ImageIcon("src/main/resources/images/logo.png");
         this.setIconImage(appIcon.getImage());
    
    }
}
