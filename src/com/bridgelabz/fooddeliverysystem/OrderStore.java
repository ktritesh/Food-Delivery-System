package com.bridgelabz.fooddeliverysystem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class OrderStore {
    private static OrderStore instance;
    Scanner scanner = new Scanner(System.in);
    Set<Order> orderSet = new HashSet<>();

    private OrderStore(){

    }

    synchronized static OrderStore getInstance(){
        if(instance == null){
            instance = new OrderStore();
        }
        return instance;
    }

    public void addOrder(Order order){
        orderSet.add(order);
    }

    public void viewOrder(Order order){
        orderSet.add(order);
    }

    public void viewOrder(){
        Stream.of(orderSet).forEach(System.out::println);
    }
}
