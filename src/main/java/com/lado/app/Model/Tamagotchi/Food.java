package com.lado.app.Model.Tamagotchi;

public class Food {
    private int id;
    private String name;

    Food(int id,String name)
    {
        this.id=id;
        this.name=name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
