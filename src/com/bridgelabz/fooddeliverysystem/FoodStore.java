package com.bridgelabz.fooddeliverysystem;

import java.util.*;
import java.util.stream.Stream;

public class FoodStore {
    Set<FoodItem> foodList = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    public void add(FoodItem foodItem) {
        foodList.add(foodItem);
    }

    public void remove(FoodItem foodItem) {
        foodList.remove(foodItem);
    }

    public void display() {
        Stream.of(foodList).forEach( System.out::println);
    }

    public void displayJuices() {
        foodList.stream().filter(x -> x.foodCategory == FoodItem.Category.JUICES)
                .forEach(System.out::println);
    }

    public void displayDessert() {
        foodList.stream().filter(x -> x.foodCategory == FoodItem.Category.DESSERT)
                .forEach(System.out::println);
    }

    public void displayMainCourse() {
        foodList.stream().filter(x -> x.foodCategory == FoodItem.Category.MAIN_COURSE)
                .forEach(System.out::println);
    }

    public void displayStarter() {
        foodList.stream().filter(x -> x.foodCategory == FoodItem.Category.STARTER)
                .forEach(System.out::println);
    }

    public void placeOrder() {
        Order order = new Order();
        boolean flag = true;
        while(flag){
            System.out.println("press 1 to place order\nPress 2 to exit");
            int ch = scanner.nextInt();
            if(ch == 1){
                System.out.println("Enter a food name: ");
                String foodName = scanner.next();
                System.out.println("Enter the food quantity: ");
                int foodQuantity = scanner.nextInt();
                System.out.println("Enter your delivery address");
                String address = scanner.next();
                order.setDeliveryAddress(address);
                System.out.println("Enter your Order Id");
                int orderId = scanner.nextInt();
                order.setOrderId(orderId);
                Iterator iterator = foodList.iterator();
                while (iterator.hasNext()){
                    FoodItem foodItem = (FoodItem) iterator.next();
                    if (foodItem.foodname.equals(foodName)){
                        order.orderList.put(foodItem, foodQuantity);
                    }
                }
                System.out.println("Current order : " + order);
            } else {
                flag = false;
            }
        }
    }
}