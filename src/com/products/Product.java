// The base class for any product that is being sold

package com.products;

public class Product {
  private String name;
  private String productType;
  private int cost;

  public Product(String name, String productType, int cost) {
    this.name = name;
    this.productType = productType;
    this.cost = cost;
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.productType;
  }

  public int getCost() {
    return this.cost;
  }
}
