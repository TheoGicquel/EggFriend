import java.lang.*;

public class Animal extends Tamagotchi
{
    private String name;
    private int age;
    private String type;
    private int energy;
    private boolean happy;
    
    /**
     * Constructeur d'objets de classe Tamagotchi
     */
    public Animal(String name, int age, String type)
    {
        this.name=name;
        this.age=age;
        this.type=type;
        energy=100;
        happy = true;
        
    }
    
    public void eat(){
        
    }
    
    public void sleep(){
        
    }
    
    public void play(){
        
    }

    public void kill(){
        //delete
    }
    
    private void grow(){
        // toutes les 86 400 secondes (un jour) age+=1
    }
}