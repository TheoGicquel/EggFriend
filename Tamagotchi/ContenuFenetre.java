import javax.swing.*;
import java.awt.*;

public class ContenuFenetre extends JPanel {
    
    private JLabel etiquette;
    private JButton bouton1;
    private JButton bouton2;
    private JButton bouton3;
    private JButton bouton4;
    private JButton bouton5;
    private JButton bouton6;
    private JButton bouton7;
    private JButton bouton8;
    private JButton bouton9;
    private JTextField champTexte;
    private JLabel imageLbl;
    private ImageIcon iconPhoto;
    
    public ContenuFenetre(){
        super();
        this.affichageContenu();       
    } 
    
    public void affichageContenu(){
        this.setLayout(null); // On n'utilise aucun gestionnaire de disposition (positionnement absolu)
        //------------------------------------------------   
        etiquette = new JLabel();
        this.etiquette.setBounds(450, 50, 500, 40); //Position et dimension de l'étiquette.
        this.etiquette.setText("Tamagotchi");
        Font font = new Font("Arial",Font.BOLD,20); //Style et taille du contenu de l'étiquette.
        this.etiquette.setFont(font);
        this.add(etiquette); // Intégration de l'étiquette au Contenu
     
        
        //------------------------------------------------
        //Création bouttons
        bouton1 = new JButton();
        this.bouton1.setText("Nourrir");
        this.bouton1.setBounds(300, 100, 110, 55);
        this.add(bouton1);
        
        bouton2 = new JButton();
        this.bouton2.setText("Jouer");
        this.bouton2.setBounds(450, 100, 110, 55);
        this.add(bouton2);
        
        bouton3 = new JButton();
        this.bouton3.setText("Laver");
        this.bouton3.setBounds(600, 100, 110, 55);
        this.add(bouton3);
        
        bouton4 = new JButton();
        this.bouton4.setText("Dormir");
        this.bouton4.setBounds(750, 100, 110, 55);
        this.add(bouton4);
        
        bouton5 = new JButton();
        this.bouton5.setText("Quitter");
        this.bouton5.setBounds(50, 400, 95, 35);
        this.add(bouton5);
        
        bouton6 = new JButton();
        this.bouton6.setText("Rafraichir");
        this.bouton6.setBounds(160, 400, 95, 35);
        this.add(bouton6);
        
        bouton7 = new JButton();
        this.bouton7.setText("Sélectionner");
        this.bouton7.setBounds(500, 400, 120, 40);
        this.add(bouton7);
        
        bouton8 = new JButton();
        this.bouton8.setText("Effectuer");
        this.bouton8.setBounds(630, 400, 120, 40);
        this.add(bouton8);
        
        bouton9 = new JButton();
        this.bouton9.setText("A propos");
        this.bouton9.setBounds(760, 400, 120, 40);
        this.add(bouton9);
        
        
        //------------------------------------------------
        //Création d'un champ de texte
        //champTexte = new JTextField();
        //this.champTexte.setBounds(210, 200, 100, 40);       
        //this.add(champTexte);
    
        
        
        //------------------------------------------------
        // Créer un dossier images dans le dossier du projet Java puis y mettre une image
        imageLbl = new JLabel();
        iconPhoto = new ImageIcon("Image/imageTamagotchi.jpeg");
        this.imageLbl.setBounds(50, 50, 200, 252); // 200 x 252 correspond à la taille de l'image
        this.imageLbl.setIcon(iconPhoto); // On intègre l'image à son Contenu
        this.add(imageLbl);
        
        
    }
}