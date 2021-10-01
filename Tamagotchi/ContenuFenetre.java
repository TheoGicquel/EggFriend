import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class ContenuFenetre extends JPanel {
    
    //private JLabel etiquette1;
    //private JLabel etiquette2;
    //private JLabel etiquette3;
    //private JLabel etiquette4;
    //private JLabel etiquette5;
    //private JLabel etiquette6;
    //private JLabel etiquette7;
    //private JLabel etiquette8;
    //private JLabel etiquette9;
    private JLabel placeLabel;
    private JButton feedButton;
    private JButton playButton;
    private JButton cleanButton;
    private JButton sleepButton;
    private JButton quitButton;
    private JButton refreshButton;
    private JButton selectButton;
    private JButton doButton;
    private JButton aboutButton;
    private JTextField champTexte;
    private JLabel imageLbl;
    private ImageIcon imagetama;
    private JProgressBar healthBar;
    private JProgressBar energyBar;
    private JProgressBar hungerBar;
    private JProgressBar cleanlinessBar;
    private JProgressBar hapinessBar;   
    
    
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
     
        JLabel healthLabel = new JLabel();
        healthLabel.setBounds(300, 165, 500, 40); 
        healthLabel.setText("Vie");
        Font font12 = new Font("Arial",Font.BOLD,12); 
        healthLabel.setFont(font12);
        this.add(healthLabel);
        
        JLabel energyLabel = new JLabel();
        energyLabel.setBounds(300, 225, 500, 40); 
        energyLabel.setText("Energie");
        energyLabel.setFont(font12);
        this.add(energyLabel);
        
        JLabel hungerLabel = new JLabel();
        hungerLabel.setBounds(300, 285, 500, 40); 
        hungerLabel.setText("Nourriture");
        hungerLabel.setFont(font12);
        this.add(hungerLabel);
        
        JLabel cleanlinessLabel = new JLabel();
        cleanlinessLabel.setBounds(300, 345, 500, 40); 
        cleanlinessLabel.setText("Hygiène");
        cleanlinessLabel.setFont(font12);
        this.add(cleanlinessLabel);
        
        JLabel hapinessLabel = new JLabel();
        hapinessLabel.setBounds(300, 405, 500, 40); 
        hapinessLabel.setText("Bonheur");
        hapinessLabel.setFont(font12);
        this.add(hapinessLabel);
        
        JLabel nameLabel = new JLabel();
        nameLabel.setBounds(30, 220, 500, 40); 
        nameLabel.setText("Nom");
        Font font16 = new Font("Arial",Font.BOLD,16);
        nameLabel.setFont(font16);
        this.add(nameLabel);
        
        JLabel breedLabel = new JLabel();
        breedLabel.setBounds(30, 250, 500, 40); 
        breedLabel.setText("Espèce");
        breedLabel.setFont(font16);
        this.add(breedLabel);
        
        JLabel moodLabel = new JLabel();
        moodLabel.setBounds(30,280, 500, 40); 
        moodLabel.setText("Humeur");
        moodLabel.setFont(font16);
        this.add(moodLabel);
        
        placeLabel = new JLabel();
        placeLabel.setBounds(30, 310, 500, 40); 
        placeLabel.setText("Lieu");
        placeLabel.setFont(font16);
        this.add(placeLabel);
        
        //------------------------------------------------
        //Création bouttons
        feedButton = new JButton();
        this.feedButton.setText("Nourrir");
        this.feedButton.setBounds(300, 85, 110, 55);
        this.add(feedButton);
        
        playButton = new JButton();
        this.playButton.setText("Jouer");
        this.playButton.setBounds(450, 85, 110, 55);
        this.add(playButton);
        
        cleanButton = new JButton();
        this.cleanButton.setText("Laver");
        this.cleanButton.setBounds(600, 85, 110, 55);
        this.add(cleanButton);
        
        sleepButton = new JButton();
        this.sleepButton.setText("Dormir");
        this.sleepButton.setBounds(750, 85, 110, 55);
        this.add(sleepButton);
        
        quitButton = new JButton();
        this.quitButton.setText("Quitter");
        this.quitButton.setBounds(50, 500, 95, 35);
        this.add(quitButton);
        
        refreshButton = new JButton();
        this.refreshButton.setText("Rafraichir");
        this.refreshButton.setBounds(160, 500, 95, 35);
        this.add(refreshButton);
        
        selectButton = new JButton();
        this.selectButton.setText("Sélectionner");
        this.selectButton.setBounds(480, 500, 120, 40);
        this.add(selectButton);
        
        doButton = new JButton();
        this.doButton.setText("Effectuer");
        this.doButton.setBounds(610, 500, 120, 40);
        this.add(doButton);
        
        aboutButton = new JButton();
        this.aboutButton.setText("A propos");
        this.aboutButton.setBounds(740, 500, 120, 40);
        this.add(aboutButton);
        
        
        //------------------------------------------------
        //Création d'un champ de texte
        //champTexte = new JTextField();
        //this.champTexte.setBounds(210, 200, 100, 40);       
        //this.add(champTexte);
    
        //------------------------------------------------
        //Création d'une barre de progression
                
        healthBar = new JProgressBar();
        
        healthBar.setBounds(300,190,560,30);
        healthBar.setForeground(Color.GREEN);
        healthBar.setStringPainted(true);
        healthBar.setValue(89);
        this.add(healthBar);
        
        energyBar = new JProgressBar();
        energyBar.setValue(48);
        energyBar.setBounds(300,250,560,30);
        energyBar.setForeground(Color.CYAN);
        energyBar.setStringPainted(true);
        this.add(energyBar);
        
        hungerBar = new JProgressBar();
        hungerBar.setValue(56);
        hungerBar.setBounds(300,310,560,30);
        hungerBar.setForeground(Color.RED);
        hungerBar.setStringPainted(true);
        this.add(hungerBar);
        
        cleanlinessBar = new JProgressBar();
        cleanlinessBar.setValue(23);
        cleanlinessBar.setBounds(300,370,560,30);
        cleanlinessBar.setForeground(Color.BLUE);
        cleanlinessBar.setStringPainted(true);
        this.add(cleanlinessBar);
        
        hapinessBar = new JProgressBar();
        hapinessBar.setValue(60);
        hapinessBar.setBounds(300,430,560,30);
        hapinessBar.setForeground(Color.YELLOW);
        hapinessBar.setStringPainted(true);
        this.add(hapinessBar);
        
        //------------------------------------------------
        //Création d'une image
        
        ImageIcon imagetama = new ImageIcon(getClass().getResource("Image/imageTama.png"));
        imageLbl = new JLabel(imagetama,JLabel.CENTER);
        this.add(imageLbl);
        this.validate();
        
        
    }
}