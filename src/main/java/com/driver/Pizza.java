package com.driver;

public class Pizza {

    private int price;
    private final Boolean isVeg;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeaway;
    private final int paperbagPrice;
    private final int extraCheesePrice;
    private final int extraToppingsPriceVeg;
    private final int extraToppingsPriceNonVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
            this.price = 300;
        } else {
            this.price = 400;
            this.price = 400;
        }
        this.paperbagPrice = 20;
        this.extraCheesePrice = 80;
        this.extraToppingsPriceNonVeg = 120;
        this.extraToppingsPriceVeg = 70;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese) {
            this.extraCheese = true;
            this.price += extraCheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppings) {
            this.extraToppings = true;
            if(isVeg) {
                this.price += extraToppingsPriceVeg;
            } else {
                this.price += extraToppingsPriceNonVeg;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway) {
            this.takeaway = true;
            this.price += paperbagPrice;
        }
    }

    public String getBill(){
        // your code goes here
        StringBuilder sb = new StringBuilder();
        sb.append("Base Price Of The Pizza: ").append(price).append("\n");
        if(extraCheese){
            sb.append("Extra Cheese Added: "+extraCheesePrice+"\n");
        }
        if(extraToppings){
            if(isVeg){
                sb.append("Extra Toppings Added: "+extraToppingsPriceVeg+"\n");
            } else {
                sb.append("Extra Toppings Added: "+extraToppingsPriceNonVeg+"\n");
            }
        }
        if(takeaway){
            sb.append("Paperbag Added: "+paperbagPrice+"\n");
        }
        sb.append("Total Price: ").append(this.price).append("\n");
        this.bill = sb.toString();
        return this.bill;
    }
}
