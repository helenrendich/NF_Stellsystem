package org.example.repo;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {



   private List<Product> products = new ArrayList<>();


  // Constructor
   public ProductRepo() {
      products.add(new Product(1, "cheese"));
      products.add(new Product(2, "bread"));
      products.add(new Product(3, "milk"));
      products.add(new Product(4, "coffee"));
      products.add(new Product(5, "tea"));
   }

   // Getter and Setter
   public List<Product> getProducts() {
      return products;
   }

   public void setProducts(List<Product> products) {
      this.products = products;
   }


   @Override
   public String toString() {
      return "ProductRepo{" +
              "productsList=" + products +
              '}';
   }

}
