package org.example;

import org.example.model.Order;
import org.example.model.Product;
import org.example.repo.OrderRepo;
import org.example.repo.ProductRepo;
import org.example.service.ShopService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ShopService shopService1 = new ShopService(new ProductRepo());
        System.out.println( shopService1.getProductByName("milk"));
        System.out.println(shopService1.getProductById(1));
        System.out.println(shopService1.listProducts());


    }
}
