package com.allanwilson;

/**
 * Created by awil on 2017-11-29.
 */
public class WilsonFamily {
    private String fullName = "Choose a Wilson";

    public WilsonFamily (String name){
        if (name == "Allan" || name == "Paula" || name == "Sampo" || name == "Seela"){
            this.fullName = name;
        }
    }

    public String getName(){
        return fullName;
    }
}
