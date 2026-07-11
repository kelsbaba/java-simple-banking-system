package com.esegine.bank.util;

public class ConsoleUI {

    public static void printMenu() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("      SIMPLE BANKING SYSTEM");
        System.out.println("========================================");
        System.out.println("1. Add Customer");
        System.out.println("2. Add Transaction");
        System.out.println("3. Print Statement");
        System.out.println("4. List Customers");
        System.out.println("5. About");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
    }

    public static void customerAdded() {
        System.out.println("\nCustomer added successfully.");
    }

    public static void customerExists() {
        System.out.println("\nCustomer already exists.");
    }

    public static void transactionAdded() {
        System.out.println("\nTransaction added successfully.");
    }

    public static void customerNotFound() {
        System.out.println("\nCustomer not found.");
    }

    public static void invalidChoice() {
        System.out.println("\nInvalid menu option.");
    }

    public static void about() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("         SIMPLE BANKING SYSTEM");
        System.out.println("========================================");
        System.out.println("Version   : 1.0");
        System.out.println("Developer : Kelly Sunday Esegine");
        System.out.println("Language  : Java");
        System.out.println("IDE       : IntelliJ IDEA");
        System.out.println("========================================");
        System.out.println("This project demonstrates:");
        System.out.println("- Object-Oriented Programming (OOP)");
        System.out.println("- Encapsulation");
        System.out.println("- Collections Framework");
        System.out.println("- Console-based User Interaction");
        System.out.println("- Clean Code Principles");
        System.out.println("========================================");
    }
}