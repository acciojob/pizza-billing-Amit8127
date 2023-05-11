package com.driver;

public class Pizza {

    private final int price;
    private final Boolean isVeg;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeaway;
    private int totalBillPrice;
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
            this.totalBillPrice = 300;
        } else {
            this.price = 400;
            this.totalBillPrice = 400;
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
            this.totalBillPrice += extraCheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppings) {
            this.extraToppings = true;
            if(isVeg) {
                this.totalBillPrice += extraToppingsPriceVeg;
            } else {
                this.totalBillPrice += extraToppingsPriceNonVeg;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway) {
            this.takeaway = true;
            this.totalBillPrice += paperbagPrice;
        }
    }

    public String getBill(){
        // your code goes here
        StringBuilder sb = new StringBuilder();
        sb.append("Base Price Of The Pizza: ").append(isVeg ? 300 : 400).append("\n");
        if(extraCheese){
            sb.append("Extra Cheese Added: 80\n");
        }
        if(extraToppings){
            if(isVeg){
                sb.append("Extra Toppings Added: 70\n");
            } else {
                sb.append("Extra Toppings Added: 120\n");
            }
        }
        if(takeaway){
            sb.append("Paperbag Added: 20\n");
        }
        sb.append("Total Price: ").append(this.totalBillPrice).append("\n");
        return sb.toString();
    }
}
