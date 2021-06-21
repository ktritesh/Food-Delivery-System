package com.bridgelabz.fooddeliverysystem;

public class FoodItems {
    enum Taste {
        SALTY, SWEET, SPICY
    }

    enum Category {
        STARTER, MAIN_COURSE, DESERT, SNACK
    }

    String name;
    int Price;
    Taste taste;
    int quantity;
    Category foodCategory;

    @Override
    public String toString() {
        return "FoodItems{" +
                "name='" + name + '\'' +
                ", Price=" + Price +
                ", taste=" + taste +
                ", quantity=" + quantity +
                ", foodCategory=" + foodCategory +
                '}';
    }
}
