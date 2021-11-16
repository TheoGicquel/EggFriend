package tests;
public class testsSuite {

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\033[1;31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";
  public static int failCounter;
  public static void main(String[] args) {
    failCounter=0; 
    // FenetreGraphique fenetre = new FenetreGraphique();
    // fenetre.setVisible(true);
    System.out.print("\033[H\033[2J");  
    System.out.flush();
    constructTest mytTest = new constructTest();
    mytTest.test();
    if(failCounter==0)
    {
      System.out.println(ANSI_GREEN+"[✔️]Aucune erreur de test !" + ANSI_RESET);
    }

  }

  protected void fail(String failed, String message) {
    failCounter++;
    System.out.println( ANSI_RED + "[❎FAIL]" + ANSI_RESET  
      + ANSI_YELLOW + "(" + failed + ")" + ANSI_RESET
      + "-> " + message);
  }
}
