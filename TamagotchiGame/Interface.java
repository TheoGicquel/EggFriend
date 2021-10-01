import javax.swing.*;
import java.awt.*;

public class Interface
{
    public Interface()
    {}

    public static void main(String[] args){
        //Création d'une nouvelle fenêtre
        JFrame ecran = new JFrame("Tamagotchi");
        
        //paramètre par default de fermeture du logiciel
        ecran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ecran.setSize(1000,600);
        ecran.setResizable(false);
        ecran.setBackground(Color.black);
        ecran.setLocationRelativeTo(null);
        
        //Création d'un panel et affiliation à la fenêtre
        JPanel panel = new JPanel();
        ecran.setContentPane(panel);
        panel.setMinimumSize(new Dimension(1000,600));
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setMaximumSize(new Dimension(1000, 600));
        panel.setBackground(Color.gray);
        
        //affichage graphique de la fenêtre
        ecran.pack();
        ecran.setVisible(true);
        
        
    }
    
}
