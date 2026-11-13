// Basic User class, can buy and sell items

package com.user;

import java.util.*;
import com.products.Product;

public class User {
  private int money = 1_000_000;
  private ArrayList<Product> products = new ArrayList<>();

  public void purchaseProduct(Product product) {
    money -= product.getCost();
    this.products.add(product); 
  }

  public boolean hasEnoughMoney(int amount) {
    return this.money >= amount;
  }
}
