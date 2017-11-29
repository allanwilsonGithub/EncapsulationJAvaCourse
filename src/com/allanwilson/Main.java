package com.allanwilson;

public class Main {

    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Allan", 200, "Dirk");
        System.out.println(player.getHealth());
        player.loseHealth(71);
        System.out.println(player.getHealth());

        WilsonFamily ChooseAWilson = new WilsonFamily("Paula");
        System.out.println("You selected: " + ChooseAWilson.getName());

        Printer AllansPrinter = new Printer(100,0,false);
        System.out.println("Toner level = " + AllansPrinter.getTonerLevel());
        AllansPrinter.fillUpToner(30);
        System.out.println("Toner level = " + AllansPrinter.getTonerLevel());
        AllansPrinter.fillUpToner(30);
        System.out.println("Toner level = " + AllansPrinter.getTonerLevel());

        System.out.println("Pages printed: " + AllansPrinter.getPagesPrinted());
        AllansPrinter.printPage(11);
        System.out.println("Pages printed: " + AllansPrinter.getPagesPrinted());

    }


}
