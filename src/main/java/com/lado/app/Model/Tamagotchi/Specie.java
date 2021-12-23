package com.lado.app.Model.Tamagotchi;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Specie implements Serializable{
 
    private String name;
    private String text;
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
     
    @Deprecated
    public Specie(String nName,String ntext,String nImageName,List<String> foodArray)
    {
        this.setName(nName);
        this.setText(ntext);
  
        this.setFavoriteFoods(foodArray);
    }
    */

    void initialize(String choice){

        if(choice == "cat"||choice == "Chat"){
            this.setName("cat");
            this.setText("Chat");
            this.addFood("Poisson");
        }

        else if(choice == "dog"||choice == "Chien"){
            this.setName("dog");
            this.setText("Chien");
            this.addFood("Os");
        }

        else if(choice == "sheep"||choice == "Mouton"){
            this.setName("sheep");
            this.setText("Mouton");
            this.addFood("Herbe");
        }

        else if(choice == "robot"||choice == "Robot"){
            this.setName("robot");
            this.setText("Robot");
            this.addFood("Vis");
        }
        else if(choice == "unknown"||choice == "Inconnu"){
            this.setName("unknown");
            this.setText("Inconnu");
            this.addFood("Nourriture");
        }else{
            this.setName("unknown");
            this.setText("Inconnu");
            this.addFood("Nourriture");
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
    



}
