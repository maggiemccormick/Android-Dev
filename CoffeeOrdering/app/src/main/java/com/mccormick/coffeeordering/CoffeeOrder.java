package com.mccormick.coffeeordering;

public class CoffeeOrder {
    private boolean wantCream;
    private boolean wantChoc;
    private Integer numCoffee;

    private final int MAX = 25;
    private final int MIN = 0;

    public CoffeeOrder(){
        wantCream = false;
        wantChoc = false;
        numCoffee = 0;
    }

    public void addCoffee(){
        if(numCoffee < MAX)
            numCoffee++;
    }
    public void subtractCoffee(){
        if(numCoffee > MIN)
            numCoffee--;
    }
    public String getQuantityString(){return numCoffee.toString();}

    public void changeCream(boolean isChecked){wantCream = isChecked;}
    public void changeChoc(boolean isChecked){wantChoc = isChecked;}

    public String getOrderSummary(){
        Double price = numCoffee * 3.50;
        if(wantChoc)
            price += numCoffee * 1.0;
        if(wantCream)
            price += numCoffee * 0.5;
        String order = "";
        order += "Add whipped cream? " + (wantCream?"yes":"no") + "\n";
        order += "Add chocolate? " + (wantChoc?"yes":"no") + "\n";
        order += "Quantity: " + getQuantityString() + "\n\n";
        order += "Price: $" + String.format("%.2f", price) + "\nTHANK YOU!";
        return order;
    }
}
