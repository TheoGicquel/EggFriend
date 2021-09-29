
/**
 * @version (22.09.21)
 */
public class Animal extends Tamagotchi
{
    public String name;
    private int age;
    private String type;
    private int energy;
    private boolean happy;
    public Animal(String name, int age, String type){
       this.name=name;
       this.age=age;
       this.type=type;
       energy=100;
       happy = true;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getType(){
        return type;
    }
    
    public void eat(){
        //steak : +50%
        //poisson : +25%
        //herbe : +10%
        //bonbon : -5%
    }
    
    public void sleep(){
        
    }
    
    public void play(){
        
    }

    public void kill(){
        //delete
    }
    
   
}