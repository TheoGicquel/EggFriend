package com.lado.app.View.UIPackage;
import javax.swing.*;

import javax.swing.JFrame;

import com.lado.app.Model.Tamagotchi.*;

public class DebugFrame extends JFrame{
    JFrame DebugFrame;
    public JLabel nameLabel;

    public DebugFrame()
    {
        setTitle("this is also a title");
 
        // create button
        JButton button = new JButton("click");

        nameLabel = new JLabel();
        add(nameLabel);
        button.setBounds(165, 135, 115, 55);
         
        // adding button on frame
        add(button);
 
        // setting close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }

    public void loadTama(Tamagotchi debugTama)
    {
        nameLabel.setText(debugTama.getName());
        //  .setText(debugTama.getName());
        setTitle(debugTama.getName());
    }

    }
