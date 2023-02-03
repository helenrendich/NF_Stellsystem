package org.example.repo;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {



   private List<Product> productsList= new ArrayList<>();


   public ProductRepo() {
      productsList.add(new Product(1, "cheese"));
      productsList.add(new Product(2, "bread"));
      productsList.add(new Product(3, "milk"));
      productsList.add(new Product(4, "coffee"));
      productsList.add(new Product(5, "tea"));
   }

   public List<Product> getProductsList() {
      return productsList;
   }

   public void setProductsList(List<Product> productsList) {
      this.productsList = productsList;
   }

   @Override
   public String toString() {
      return "ProductRepo{" +
              "productsList=" + productsList +
              '}';
   }

}
