package com.lado.app.View.UIPackage;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.lado.app.Model.Tamagotchi.Tamagotchi;



public class GameWindow implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("HElo");
    JButton myvButton = new JButton("bou");

    GameWindow(String NewTamaName, String newTamaSpecie)
    {
        frame.setTitle("TamagotchiGame - " + NewTamaName);
        genericConstructor();
    }


    GameWindow(Tamagotchi tama)
    {
        frame.setTitle("TamagotchiGame - " + tama.getName());
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
 