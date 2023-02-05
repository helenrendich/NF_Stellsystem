package org.example.repo;

import org.example.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {

    private List<Order> orders = new ArrayList<>();

    public void add(Order neworder){
        this.orders.add(neworder);
    }

    // Constructor
    public OrderRepo(List<Order> orders) {
        this.orders = orders;
    }

    // Getter and Setter
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

}
