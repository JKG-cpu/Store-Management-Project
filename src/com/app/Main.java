// Main Entry Point

package com.app;

import com.products.jellos.*;

public class Main {
  public static void main() {
    // Create sample products
    ButterScotch product1 = new ButterScotch(100);
    LemonTajin product2 = new LemonTajin(50);
    SaltedCucumber product3 = new SaltedCucumber(25);

    // Get product String (Name + Type)
    System.out.println("Product 1 String: " + product1.toString());
    System.out.println("Product 1 String: " + product1.toString());
    System.out.println("Product 1 String: " + product1.toString());

    // Get product Cost
    System.out.println("Product 1 Cost: " + product1.getCost());
    System.out.println("Product 2 Cost: " + product1.getCost());
    System.out.println("Product 3 Cost: " + product1.getCost());
  }
}
