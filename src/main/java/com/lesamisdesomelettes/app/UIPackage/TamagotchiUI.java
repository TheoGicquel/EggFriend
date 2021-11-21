package UIPackage;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TamagotchiUI extends JFrame {

  // Frame >> panel
  public TamagotchiUI() {
    JFrame tamagoFrame = new JFrame("Tamagotchi");
    JFrame.setDefaultLookAndFeelDecorated(false);
    tamagoFrame.setDefaultCloseOperation(3);

    JPanel panelA = new JPanel();

    JPanel panelB = new JPanel();

    GridLayout grid = new GridLayout(1, 2);

    panelB.setLayout(grid);

    panelA.setBackground(Color.MAGENTA);
    panelA.setLayout(grid);

    // Set border for the panel
    //panel.setBorder(new EmptyBorder(new Insets(50, 80, 50, 80)));

    // Define new buttons
    JButton jb1 = new JButton("Button 1");
    JButton jb2 = new JButton("Button 2");
    JButton jb3 = new JButton("Button 3");

    // Add buttons to the frame (and spaces between buttons)
    panelA.add(jb1);
    //panel.add(Box.createRigidArea(new Dimension(0, 60)));
    panelA.add(jb2);
    //panel.add(Box.createRigidArea(new Dimension(0, 60)));
    panelA.add(jb3);

    panelB.add(jb1);
    panelB.add(jb2);
    panelB.add(jb3);

    // Set size for the frame
    //frame.setSize(300, 300);

    // Set the window to be visible as the default to be false
    tamagoFrame.add(panelA);
    tamagoFrame.add(panelB);

    tamagoFrame.pack();
    tamagoFrame.setVisible(true);
  }
  /*
 public GridLayoutExemple(){
     JFrame frame = new JFrame();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(250,250);
     frame.setVisible(true);
     JPanel panel = new JPanel();
     frame.setContentPane(panel);
     panel.setLayout(grid);
     
     panel.add(new JButton("1"));
     panel.add(new JButton("2"));
     panel.add(new JButton("3"));
     panel.add(new JButton("4"));
     panel.add(new JButton("5"));
     panel.add(new JButton("6"));
 }
 */
}
