package com.lado.app.model.tamagotchi;
/**
 * @file Specie.java
 * @author Théo Gicquel
 * Objet représentant l'espèce d'un Tamagotchi ( Chien, Chat, Mouton, etc...)
 */

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



    void initialize(String choice){
        favoriteFoods.clear();
        if("cat".equals(choice)||"Chat".equals(choice)){
            this.setName("cat");
            this.setText("Chat");
            this.addFood("Poisson");
            this.addFood("Croquettes");
        }

        else if("dog".equals(choice)||"Chien".equals(choice)){
            this.setName("dog");
            this.setText("Chien");
            this.addFood("Croquettes");
        }

        else if("sheep".equals(choice)||"Mouton".equals(choice)){
            this.setName("sheep");
            this.setText("Mouton");
            this.addFood("Herbe");
        }

        else if("robot".equals(choice)||"Robot".equals(choice)){
            this.setName("robot");
            this.setText("Robot");
            this.addFood("Ecrous");
        }
        else{
            this.setName("unknown");
            this.setText("Inconnu");
            this.addFood("N/A");
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
        if(favoriteFoods.size()>index)
        {
            return favoriteFoods.get(index);
        }
        else
        {
            return "";
        }

    }
    



}
