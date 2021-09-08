import javax.swing.*;
import java.awt.*;

/**
 * Décrivez votre classe Interface ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Interface
{
    public Interface()
    {}

    public static void main(String[] args){
        JFrame ecran = new JFrame("Tamagotchi");
        ecran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ecran.setSize(1000,600);
        ecran.setResizable(false);
        ecran.setBackground(Color.black);
        ecran.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        ecran.setContentPane(panel);
        panel.setMinimumSize(new Dimension(1000,600));
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setMaximumSize(new Dimension(1000, 600));
        panel.setBackground(Color.gray);
        
        ecran.pack();
        ecran.setVisible(true);
        
        
    }
    
}
