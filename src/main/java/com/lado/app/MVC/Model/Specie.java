package com.lado.app.MVC.Model;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class Specie {
 
    private String name;
    private String text;
    private String imageName;
    private List<String> favoriteFoods = new ArrayList<>();


    public Specie(String choice)
    {
        initialize(choice);
    }


    /***
     * @brief Constructeur complet
     * @param nName
     * @param ntext
     * @param nImageName
     * @param foodArray
     */
    public Specie(String nName,String ntext,String nImageName,List<String> foodArray)
    {
        this.setName(nName);
        this.setText(ntext);
        this.setImageName(nImageName);
        this.setFavoriteFoods(foodArray);
    }


    void initialize(String choice){
        this.setName(choice);
        this.setImageName(choice);

        switch(choice){
   
            case "sheep": 
                this.setText("Mouton");
                this.addFood("Herbe");
                break;
        
            case "robot":
                this.setText("Robot");
                this.addFood("Herbe");
                break;
        
            case "dog":
                this.setText("Chien");
                this.addFood("Os");
                break;
                
            case "cat":
                this.setText("Chat");
                this.addFood("Poisson");
                break;
            case "unknown":
                this.setText("Inconnu");
                this.addFood("Nourriture");
                break;
            default:
                System.out.println("ERREUR CONSTRUCTEUR SPECIE :");
                System.out.println(choice);

        }
    }

    public void setName(String newName)
    {
        if(newName.length()>0)
        {
            this.name=newName;
        }
    }

    public String getName()
    {
        return this.name;
    }

    public void setText(String newText)
    {
        if(newText.length()>0)
        {
            this.text=newText;
        }
    }

    public String getText()
    {
        return this.text;
    }

    public void setFavoriteFoods(List<String> newFoods)
    {
        this.favoriteFoods=newFoods;
    }


    public void addFood(String newFood)
    {
        if(newFood.length()>0)
        this.favoriteFoods.add(newFood);
    }


    public List<String> getFavoriteFoods()
    {
        return favoriteFoods;
    }


    public String getFavoriteFood(int index)
    {
        return favoriteFoods.get(index);
    }
    

    public void setImageName(String newText)
    {
        if(newText.length()>0)
        {
            this.imageName=newText;
        }
    }

}
