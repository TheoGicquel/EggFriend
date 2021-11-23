package com.lado.app.UIPackage;

import com.lado.app.Tamagotchi.Tamagotchi;
import com.lado.app.UIPackage.UIBuilder.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JFrame;

public class GameFrame extends Window {

  public GameFrame(Tamagotchi tamagotchi) {
    this.setSize(400, 400);
    this.setTitle("TITRE FENETRE");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    // ImageIcon appIcon = new ImageIcon("src/main/resources/images/logo.png");
    // this.setIconImage(appIcon.getImage());
    Color backgroundColor = new Color(0xa0a0a0);
    this.getContentPane().setBackground(backgroundColor);

    JLabel nameLbl = new JLabel();
    nameLbl.setText("Name: " + tamagotchi.getName());

    //nameLbl.setIcon(appIcon);
    nameLbl.setFont(new Font("Arial", Font.BOLD, 14));
    nameLbl.setForeground(Color.WHITE);
    nameLbl.setHorizontalTextPosition(JLabel.CENTER);
    nameLbl.setVerticalTextPosition(JLabel.TOP);

    this.add(nameLbl);
    this.setVisible(true);
  }

  void init() {}
}
