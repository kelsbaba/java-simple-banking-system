package com.esegine.bank.app;

import com.esegine.bank.exception.CustomerAlreadyExistsException;
import com.esegine.bank.exception.CustomerNotFoundException;
import com.esegine.bank.service.BankService;
import com.esegine.bank.util.ConsoleUI;
import com.esegine.bank.util.InputHelper;

public class Main {

    public static void main(String[] args) {

        BankService bank = new BankService("Access Bank");
        InputHelper input = new InputHelper();

        boolean running = true;

        while (running) {

            ConsoleUI.printMenu();

            int option = input.readInt("");

            switch (option) {

                case 1 -> {

                    try {

                        String customerName =
                                input.readString("Enter customer name: ");

                        bank.addCustomer(customerName);

                        ConsoleUI.customerAdded();

                    } catch (CustomerAlreadyExistsException e) {
                        System.out.println("\n" + e.getMessage());
                    }
                    catch (IllegalArgumentException e) {
                        System.out.println("\n" + e.getMessage());
                    }
                }

                case 2 -> {

                    try {

                        String customerName =
                                input.readString("Enter customer name: ");

                        double amount =
                                input.readDouble("Enter transaction amount: ");

                        bank.addTransaction(customerName, amount);

                        ConsoleUI.transactionAdded();

                    } catch (CustomerNotFoundException e) {
                        System.out.println("\n" + e.getMessage());
                    }
                    catch (IllegalArgumentException e) {
                        System.out.println("\n" + e.getMessage());
                    }
                }

                case 3 -> {

                    String customerName =
                            input.readString("Enter customer name: ");

                    bank.printStatement(customerName);
                }

                case 4 -> {

                    bank.listCustomers();
                }

                case 5 -> {

                    ConsoleUI.about();
                }

                case 6 -> {

                    running = false;
                    System.out.println("\nThank you for using the application.");
                }

                default -> ConsoleUI.invalidChoice();
            }
        }

        input.close();
    }
}