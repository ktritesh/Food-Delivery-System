package com.bridgelabz.fooddeliverysystem;

import java.util.Scanner;

public class FoodDeliverySystem {

    static FoodStore foodStore = new FoodStore();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to food delivery System.");
        FoodDeliverySystem foodDeliverySystem = new FoodDeliverySystem();
        foodDeliverySystem.userMenu();
    }

    public void addFood() {
            FoodItems foodItems = new FoodItems();
                System.out.print("Enter the food name : ");
                foodItems.name = sc.nextLine();
                System.out.print("Enter the food price : ");
                foodItems.Price = sc.nextInt();
                System.out.print("Enter the food quantity : ");
                foodItems.quantity = sc.nextInt();
                System.out.println();

                System.out.print("Enter the food taste : ");
                System.out.print("1 for Salty,  ");
                System.out.print("2 for Sweet,  ");
                System.out.print("3 for Spicy,  ");
                int foodTaste = sc.nextInt();
                if (foodTaste == 1)
                    foodItems.taste = FoodItems.Taste.SALTY;
                else if (foodTaste == 2)
                    foodItems.taste = FoodItems.Taste.SWEET;
                else if (foodTaste == 3)
                    foodItems.taste = FoodItems.Taste.SPICY;
                System.out.println();

                System.out.print("Enter the food category : ");
                System.out.print("1 for Starter,  ");
                System.out.print("2 for Main Course,  ");
                System.out.print("3 for Desert,  ");
                System.out.print("4 for Snacks,  ");
                int foodCat = sc.nextInt();
                if (foodCat == 1)
                    foodItems.foodCategory = FoodItems.Category.STARTER;
                else if (foodCat == 2)
                    foodItems.foodCategory = FoodItems.Category.MAIN_COURSE;
                else if (foodCat == 3)
                    foodItems.foodCategory = FoodItems.Category.DESERT;
                else if (foodCat == 4)
                    foodItems.foodCategory = FoodItems.Category.SNACK;

                foodStore.add(foodItems);
                sc.nextLine();
                System.out.println();
            }

    public void userMenu() {
        while (true) {
            System.out.println("Enter 1 for Display all items");
            System.out.println("Enter 2 for Display Starter");
            System.out.println("Enter 3 for Display Main Course");
            System.out.println("Enter 4 for Display Desert");
            System.out.println("Enter 5 for Display Snacks");
            System.out.println("ENTER 6 FOR ADDING FOOD DETAILS");
            System.out.println("Enter 7 for exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    foodStore.display();
                    break;
                case 2:
                    foodStore.displayStarter();
                    break;
                case 3:
                    foodStore.displayMainCourse();
                    break;
                case 4:
                    foodStore.displayDesert();
                    break;
                case 5:
                    foodStore.displaySnack();
                    break;
                case 6:
                    addFood();
            }
            if (choice == 7)
                break;
        }
    }
}
