package com.bridgelabz.fooddeliverysystem;

import java.util.*;

public class FoodStore {
    Set<FoodItems> foodList = new HashSet<>();

    public void add(FoodItems foodItems) {
        foodList.add(foodItems);
    }

    public void remove(FoodItems foodItems) {
        foodList.remove(foodItems);
    }

    public void display() {
        Iterator iterator = foodList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void displayStarter() {
        Iterator iterator = foodList.iterator();
        while (iterator.hasNext()) {
            if (((FoodItems) iterator.next()).foodCategory == FoodItems.Category.STARTER) {
                System.out.println(iterator.next());
            }
        }
    }

    public void displayMainCourse() {
        Iterator iterator = foodList.iterator();
        while (iterator.hasNext()) {
            if (((FoodItems) iterator.next()).foodCategory == FoodItems.Category.MAIN_COURSE) {
                System.out.println(iterator.next());
            }
        }
    }

    public void displayDesert() {
        Iterator iterator = foodList.iterator();
        while (iterator.hasNext()) {
            if (((FoodItems) iterator.next()).foodCategory == FoodItems.Category.MAIN_COURSE) {
                System.out.println(iterator.next());
            }
        }
    }

    public void displaySnack() {
        Iterator iterator = foodList.iterator();
        while (iterator.hasNext()) {
            if (((FoodItems) iterator.next()).foodCategory == FoodItems.Category.SNACK) {
                System.out.println(iterator.next());
            }
        }
    }
}
