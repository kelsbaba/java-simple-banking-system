package com.esegine.bank.util;

import java.util.Scanner;

public class InputHelper {

    private final Scanner scanner;

    public InputHelper() {
        scanner = new Scanner(System.in);
    }

    public String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public double readDouble(String prompt) {

        while (true) {

            System.out.print(prompt);

            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                return value;
            }

            System.out.println("Invalid number. Please try again.");
            scanner.nextLine();
        }
    }

    public int readInt(String prompt) {

        while (true) {

            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine(); // consume newline
                return value;
            }

            System.out.println("Invalid option. Please enter a number.");
            scanner.nextLine();
        }
    }

    public void close() {
        scanner.close();
    }
}