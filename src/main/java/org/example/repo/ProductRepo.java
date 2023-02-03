package org.example.repo;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {



   private List<Product> productsList= new ArrayList<>();
   public ProductRepo(){}

   public ProductRepo(List<Product> productsList) {
      this.productsList = productsList;
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
