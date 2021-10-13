package UIPackage;



import java.lang.*;
import javax.swing.*;
import java.awt.*;


public class ContenuFenetre extends UIBuilder {

    private JLabel locationLabel;
    private JButton feedButton;
    private JButton playButton;
    private JButton cleanButton;
    private JButton sleepButton;
    private JButton quitButton;
    private JButton refreshButton;
    private JButton selectButton;
    private JButton doButton;
    private JButton aboutButton;
    //private JTextField champTexte;
    private JLabel imageLbl;
    //private ImageIcon imagetama;
    private JProgressBar healthBar;
    private JProgressBar energyBar;
    private JProgressBar hungerBar;
    private JProgressBar cleanlinessBar;
    private JProgressBar hapinessBar;   
    
    
    public ContenuFenetre(){
       // super();
        this.affichageContenu();       
    } 


    public void affichageContenu(){
        
        this.setLayout(null); // On n'utilise aucun gestionnaire de disposition (positionnement absolu)

        // Définitions des polices d'écriture
        Font normalFont = new Font("Arial",Font.BOLD,12); 
        Font largeFont = new Font("Arial",Font.BOLD,16);
        Font hugeFont = new Font("Arial",Font.BOLD,24); //Style et taille du contenu de l'étiquette.


        int barLabelDefaulty=165;
        int barLabelDefaultX=300;
        int barLabelIncrement=60;

        JLabel titleLabel = verticalBuilder("Tamagotchi", 450, 10, 0, 0, hugeFont);
        JLabel healthLabel = verticalBuilder("vie",barLabelDefaultX, barLabelDefaulty, barLabelIncrement, 0, normalFont);
        JLabel energyLabel = verticalBuilder("Energie",barLabelDefaultX, barLabelDefaulty, barLabelIncrement,  1, normalFont);
        JLabel hungerLabel = verticalBuilder("Nourriture",barLabelDefaultX, barLabelDefaulty, barLabelIncrement,  2, normalFont);
        JLabel cleanLinessLabel = verticalBuilder("health points",barLabelDefaultX, barLabelDefaulty, barLabelIncrement,  3, normalFont);
        JLabel hapinessLabel = verticalBuilder("health points",barLabelDefaultX, barLabelDefaulty, barLabelIncrement,  4, normalFont);
        
        this.add(titleLabel);
        this.add(healthLabel);
        this.add(energyLabel);
        this.add(hungerLabel);
        this.add(cleanLinessLabel);
        this.add(hapinessLabel);

        // Infos sur le tamagotchi

        int infoDefaultx=30;
        int infoDefaultY=220;
        int infoIncrement=30;

        JLabel nameLabel = verticalBuilder("nom", infoDefaultx, infoDefaultY, infoIncrement, 0, largeFont);
        JLabel breedLabel = verticalBuilder("Espece", infoDefaultx, infoDefaultY, infoIncrement, 2, largeFont);
        JLabel moodLabel = verticalBuilder("Humeur", infoDefaultx, infoDefaultY, infoIncrement, 3, largeFont);
        JLabel locationLabel = verticalBuilder("Lieu", infoDefaultx, infoDefaultY, infoIncrement, 4, largeFont);
        
        this.add(nameLabel);
        this.add(breedLabel);
        this.add(moodLabel);
        this.add(locationLabel);

        //------------------------------------------------
        //Création bouttons
        feedButton = new JButton();
        this.feedButton.setText("Nourrir");
        this.feedButton.setBounds(300, 85, 110, 55);
        this.add(feedButton);
        // +150
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
        
      //  ImageIcon imagetama = new ImageIcon(getClass().getResource("Image/imageTama.png"));
       // imageLbl = new JLabel(imagetama,JLabel.CENTER);
     //   this.add(imageLbl);
        this.validate();
        
        
    }
}