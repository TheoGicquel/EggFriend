import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class ContenuFenetre extends JPanel {
    
    private JLabel etiquette1;
    private JLabel etiquette2;
    private JLabel etiquette3;
    private JLabel etiquette4;
    private JLabel etiquette5;
    private JLabel etiquette6;
    private JLabel etiquette7;
    private JLabel etiquette8;
    private JLabel etiquette9;
    private JLabel etiquette10;
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
    private ImageIcon imagetama;
    private JProgressBar barre1;
    private JProgressBar barre2;
    private JProgressBar barre3;
    private JProgressBar barre4;
    private JProgressBar barre5;   
    
    
    public ContenuFenetre(){
        super();
        this.affichageContenu();       
    } 
    
    public void affichageContenu(){
        this.setLayout(null); // On n'utilise aucun gestionnaire de disposition (positionnement absolu)
        //------------------------------------------------   
        JLabel etiquette1 = new JLabel();
        etiquette1.setBounds(450, 10, 500, 40); //Position et dimension de l'étiquette.
        etiquette1.setText("Tamagotchi");
        Font font24 = new Font("Arial",Font.BOLD,24); //Style et taille du contenu de l'étiquette.
        etiquette1.setFont(font24);
        this.add(etiquette1); // Intégration de l'étiquette au Contenu
     
        JLabel etiquette2 = new JLabel();
        etiquette2.setBounds(300, 165, 500, 40); 
        etiquette2.setText("Vie");
        Font font12 = new Font("Arial",Font.BOLD,12); 
        etiquette2.setFont(font12);
        this.add(etiquette2);
        
        JLabel etiquette3 = new JLabel();
        etiquette3.setBounds(300, 225, 500, 40); 
        etiquette3.setText("Energie");
        etiquette3.setFont(font12);
        this.add(etiquette3);
        
        JLabel etiquette4 = new JLabel();
        etiquette4.setBounds(300, 285, 500, 40); 
        etiquette4.setText("Nourriture");
        etiquette4.setFont(font12);
        this.add(etiquette4);
        
        JLabel etiquette5 = new JLabel();
        etiquette5.setBounds(300, 345, 500, 40); 
        etiquette5.setText("Hygiène");
        etiquette5.setFont(font12);
        this.add(etiquette5);
        
        JLabel etiquette6 = new JLabel();
        etiquette6.setBounds(300, 405, 500, 40); 
        etiquette6.setText("Bonheur");
        etiquette6.setFont(font12);
        this.add(etiquette6);
        
        JLabel etiquette7 = new JLabel();
        etiquette7.setBounds(30, 220, 500, 40); 
        etiquette7.setText("Nom");
        Font font16 = new Font("Arial",Font.BOLD,16);
        etiquette7.setFont(font16);
        this.add(etiquette7);
        
        JLabel etiquette8 = new JLabel();
        etiquette8.setBounds(30, 250, 500, 40); 
        etiquette8.setText("Espèce");
        etiquette8.setFont(font16);
        this.add(etiquette8);
        
        JLabel etiquette9 = new JLabel();
        etiquette9.setBounds(30,280, 500, 40); 
        etiquette9.setText("Humeur");
        etiquette9.setFont(font16);
        this.add(etiquette9);
        
        etiquette10 = new JLabel();
        etiquette10.setBounds(30, 310, 500, 40); 
        etiquette10.setText("Lieu");
        etiquette10.setFont(font16);
        this.add(etiquette10);
        
        //------------------------------------------------
        //Création bouttons
        bouton1 = new JButton();
        this.bouton1.setText("Nourrir");
        this.bouton1.setBounds(300, 85, 110, 55);
        this.add(bouton1);
        
        bouton2 = new JButton();
        this.bouton2.setText("Jouer");
        this.bouton2.setBounds(450, 85, 110, 55);
        this.add(bouton2);
        
        bouton3 = new JButton();
        this.bouton3.setText("Laver");
        this.bouton3.setBounds(600, 85, 110, 55);
        this.add(bouton3);
        
        bouton4 = new JButton();
        this.bouton4.setText("Dormir");
        this.bouton4.setBounds(750, 85, 110, 55);
        this.add(bouton4);
        
        bouton5 = new JButton();
        this.bouton5.setText("Quitter");
        this.bouton5.setBounds(50, 500, 95, 35);
        this.add(bouton5);
        
        bouton6 = new JButton();
        this.bouton6.setText("Rafraichir");
        this.bouton6.setBounds(160, 500, 95, 35);
        this.add(bouton6);
        
        bouton7 = new JButton();
        this.bouton7.setText("Sélectionner");
        this.bouton7.setBounds(480, 500, 120, 40);
        this.add(bouton7);
        
        bouton8 = new JButton();
        this.bouton8.setText("Effectuer");
        this.bouton8.setBounds(610, 500, 120, 40);
        this.add(bouton8);
        
        bouton9 = new JButton();
        this.bouton9.setText("A propos");
        this.bouton9.setBounds(740, 500, 120, 40);
        this.add(bouton9);
        
        
        //------------------------------------------------
        //Création d'un champ de texte
        //champTexte = new JTextField();
        //this.champTexte.setBounds(210, 200, 100, 40);       
        //this.add(champTexte);
    
        //------------------------------------------------
        //Création d'une barre de progression
                
        barre1 = new JProgressBar();
        
        barre1.setBounds(300,190,560,30);
        barre1.setForeground(Color.GREEN);
        barre1.setStringPainted(true);
        barre1.setValue(89);
        this.add(barre1);
        
        barre2 = new JProgressBar();
        barre2.setValue(48);
        barre2.setBounds(300,250,560,30);
        barre2.setForeground(Color.CYAN);
        barre2.setStringPainted(true);
        this.add(barre2);
        
        barre3 = new JProgressBar();
        barre3.setValue(56);
        barre3.setBounds(300,310,560,30);
        barre3.setForeground(Color.RED);
        barre3.setStringPainted(true);
        this.add(barre3);
        
        barre4 = new JProgressBar();
        barre4.setValue(23);
        barre4.setBounds(300,370,560,30);
        barre4.setForeground(Color.BLUE);
        barre4.setStringPainted(true);
        this.add(barre4);
        
        barre5 = new JProgressBar();
        barre5.setValue(60);
        barre5.setBounds(300,430,560,30);
        barre5.setForeground(Color.YELLOW);
        barre5.setStringPainted(true);
        this.add(barre5);
        
        //------------------------------------------------
        //Création d'une image
        
        ImageIcon imagetama = new ImageIcon(getClass().getResource("Image/imageTama.png"));
        imageLbl = new JLabel(imagetama,JLabel.CENTER);
        this.add(imageLbl);
        this.validate();
        
        
    }
}