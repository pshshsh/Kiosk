package com.example.level6;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  private List<MenuItem> cart;

 public Cart(){
    this.cart = new ArrayList<>();
  }

  public void addCart(MenuItem menuItem){
   cart.add(menuItem);
  }

  public boolean isEmptyCart(){
   return cart.isEmpty(); // 비어있으면 true 반환, 비어있지 않으면 false 반환
  }
  public double totalPrice(){
   double total =  0;
    for (int i = 0; i < cart.size(); i++) {
      total = total +  cart.get(i).getCost() / 1000.0;
    }
    return total;
  }

  public void displayCart(){

    for (int i = 0; i < cart.size(); i++) {
      System.out.printf("%d. %s | W %.1f | %s%n",
          i + 1,
          cart.get(i).getName(),
          cart.get(i).getCost() / 1000.0,
          cart.get(i).getEx());
      double total = totalPrice();
      System.out.println("[ Total ]");
      System.out.println("W " + total);

    }
    }
    public void clearCart(){
      cart.clear();
  }
}
