package org.example;

import org.example.model.Order;
import org.example.model.Product;
import org.example.repo.OrderRepo;
import org.example.repo.ProductRepo;
import org.example.service.ShopService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ShopService shopService1 = new ShopService(new ProductRepo());
        //System.out.println( shopService1.getProductByName("milk"));
        //System.out.println(shopService1.getProductById(1));
        //System.out.println(shopService1.listProducts());


        shopService1.getProductById(1);

         ArrayList<Product> products1= new ArrayList<>();
         products1.add(new Product(2,"bread"));
         products1.add(new Product(3,"milk"));


         Order order1 = new Order(1, products1);
        Order order2 = new Order(2, products1);
         System.out.println(order1);

         //OrderRepo:
         ArrayList<Order> orders = new ArrayList<Order>();
          orders.add(order1);
          orders.add(order2);
        //shopService1.addNewOrder(order1);
        System.out.println(orders);
        //shopService1.addNewOrder(order1);



    }
}
