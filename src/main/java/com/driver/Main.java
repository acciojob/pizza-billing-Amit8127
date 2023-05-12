package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
//    dp.addExtraCheese();
    dp.addExtraToppings();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    DeluxePizza dp1 = new DeluxePizza(false);
    System.out.println(dp1.getPrice());
    dp1.addTakeaway();
//    dp1.addExtraCheese();
    dp1.addExtraToppings();
//    dp1.addExtraCheese();
    dp1.addTakeaway();
    System.out.println(dp1.getBill());

    Pizza p = new Pizza(true);
    System.out.println(p.getPrice());
//    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());

    Pizza p1 = new Pizza(false);
    System.out.println(p1.getPrice());
//    p1.addExtraCheese();
    p1.addTakeaway();
    System.out.println(p1.getBill());
  }
}