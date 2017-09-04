package com.allanwilson;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Allan";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Health remaining: " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Health remaining: " + player.healthRemaining());

        EnhancedPlayer ePlayer = new EnhancedPlayer("Allan",150,"Peashooter");
        System.out.println("Health: " + ePlayer.getHealth());

    }
}
