package org.example.service;

import org.example.model.Order;
import org.example.model.Product;
import org.example.repo.OrderRepo;
import org.example.repo.ProductRepo;

import java.util.ArrayList;
import java.util.List;

public class ShopService {

    public OrderRepo orderRepo;
    public ProductRepo productRepo;



    public Product getProductByName(String productName){
        for (Product p: productRepo.getProductsList()){
            if(p.getName().equals(productName)){
                return p;
            }
        }
        return null;
    }

    public Product getProductById(int productId){
        for (Product p: productRepo.getProductsList()){
            if(p.getId() == productId){
                return p;
            }
        }
        return null;
    }

    public List<Product> listProducts(){
        return productRepo.getProductsList();
    }

    public ShopService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public ShopService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public ShopService(){}

    public OrderRepo getOrderRepo() {
        return orderRepo;
    }

    public void setOrderRepo(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public ProductRepo getProductRepo() {
        return productRepo;
    }

    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "orderRepo=" + orderRepo +
                ", productRepo=" + productRepo +
                '}';
    }

}
