package com.mccormick.coffeeordering;

public class CoffeeOrder {
    private boolean wantCream;
    private boolean wantChoc;
    private int numCoffee;

    public CoffeeOrder(){
        wantCream = false;
        wantChoc = false;
        numCoffee = 0;
    }

    public void addCoffee(){numCoffee++;}
    public void subtractCoffee(){numCoffee--;}
    public Integer getCoffee(){return numCoffee;}
    public void changeCream(){wantCream = !wantCream;}
    public boolean getCream(){return wantCream;}
    public void changeChoc(){wantChoc = !wantChoc;}
    public boolean getChoc(){return wantChoc;}
}
