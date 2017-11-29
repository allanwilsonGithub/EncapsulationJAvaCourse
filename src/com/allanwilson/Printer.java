package com.allanwilson;

/**
 * Created by awil on 2017-11-29.
 */
public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean duplex = true;

    public Printer(int tonerLevel,int pagesPrinted, boolean duplex){
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int getTonerLevel(){
        return tonerLevel;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

    public void fillUpToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount < 100) {
            if (tonerLevel + tonerAmount <= 100) {
                tonerLevel = tonerLevel + tonerAmount;
            } else {
                System.out.println("Toner is full!");
                tonerLevel = 100;
            }
        } else {
                System.out.println("Input a tonerAmount between 0 and 100");
            }
    }

    public void printPage(int pagesToPrint){
        if (pagesToPrint > 0 ) {
            if (duplex){
                pagesPrinted = pagesPrinted + (pagesToPrint/2);
                if (pagesToPrint%2 == 1){
                    pagesPrinted = pagesPrinted + 1;
                }
            } else {
                pagesPrinted = pagesPrinted + pagesToPrint;
            }
        }
    }
}
