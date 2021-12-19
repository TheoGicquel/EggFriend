package com.lado.app.View.UIPackage;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class GameWindow implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("HElo");
    JButton myvButton = new JButton("bou");

    GameWindow()
    {
        myvButton.setBounds(100,100,200,40);
        myvButton.setFocusable(false);
        myvButton.addActionListener(this);
        frame.add(myvButton);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420,420);
        
        //frame.setLayout(null);
        frame.pack();
        frame.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myvButton)
        {
           JOptionPane.showMessageDialog(null, "Veuillez Sélectionner une espèce", "Erreur de sélection", JOptionPane.NO_OPTION);
        } 
        
    }
}
 