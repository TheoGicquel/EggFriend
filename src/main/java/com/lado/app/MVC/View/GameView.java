package com.lado.app.MVC.View;

    

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.lado.app.MVC.Controller.TamagotchiController;
import com.lado.app.Model.Tamagotchi.Tamagotchi;



public class GameView implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("HElo");
    JButton myvButton = new JButton("bou");




    GameView(TamagotchiController model, boolean isNewGame)
    {
        if(isNewGame)
        {
            frame.setTitle("TamagotchiGame - Nouvelle Partie");
        }
        else
        {
            frame.setTitle("TamagotchiGame - Charger Partie");
        }
        genericConstructor();
    }



    void genericConstructor()
    {
        myvButton.setBounds(100,100,200,40);
        myvButton.setFocusable(false);
        myvButton.addActionListener(this);
        frame.add(myvButton);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        
        //frame.setLayout(null);
        frame.pack();
        frame.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myvButton)
        {

        } 
        
    }
}
 

