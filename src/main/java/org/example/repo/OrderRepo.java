package org.example.repo;

import org.example.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {

    private List<Order> orders = new ArrayList<>();

    public OrderRepo(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }




    public void addNewOrder(Order neworder){
        this.orders.add(neworder);
    }






}
