package com.lado.app;

public class DebugMode {
    
    public boolean enabled;
    
    // default game parameters
    public int timescale=1;
    public boolean verbose = false;
    
    DebugMode(boolean debugFlag)
    {
        enabled=debugFlag;
        applyParams();
    }

    DebugMode()
    {
        enabled=false;
        applyParams();
    }

    void applyParams()
    {
        // Switch game to debug mode;
        if(enabled)
        {
            timescale = 2;
            verbose = true;
        }
        

    }

    public void verbose(String input)
    {
        if(enabled)
        {
            System.out.println(input);
        }
    } 

    
}
