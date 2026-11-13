// This is the shop class
// Handles things like purchasing products, restocking, creating products, etc

package com.shop;

import java.util.*;
import com.products.Product;

public class Shop {
  private final HashMap<String, ArrayList<Product>> products = new HashMap<>();

  // Product Management
  public void addProduct(Product product) {
    products.computeIfAbsent(product.getType(), k -> new ArrayList<>())
      .add(product);
  }

  public List<Product> getProductsWithType(String type) {
    return products.getOrDefault(type, new ArrayList<>());
  }

  public Set<String> getProductTypes() {
    return products.keySet();
  }

  public boolean removeProduct(Product product) {
    List<Product> category = products.get(product.getType());

    if (category == null) {
      return false;
    }

    return category.remove(product);
  }

  public void removeType(String type) {
    products.remove(type);
  }
}
