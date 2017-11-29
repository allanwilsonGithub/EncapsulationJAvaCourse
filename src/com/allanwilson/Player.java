package com.allanwilson;

/**
 * Created by awil on 2017-11-29.
 */
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player is knocked out");
            //Reduce number of player lives remaining
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}