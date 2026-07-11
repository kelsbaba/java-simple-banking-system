package com.esegine.bank.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final String bankName;
    private final List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName.trim();
        this.customers = new ArrayList<>();
    }

    public boolean addCustomer(String customerName) {

        if (customerName == null || customerName.trim().isEmpty()) {
            return false;
        }

        if (findCustomer(customerName) != null) {
            return false;
        }

        customers.add(new Customer(customerName));
        return true;
    }

    public boolean addTransaction(String customerName, double amount) {

        if (amount == 0) {
            return false;
        }

        Customer customer = findCustomer(customerName);

        if (customer == null) {
            return false;
        }

        customer.addTransaction(amount);
        return true;
    }

    public void printStatement(String customerName) {

        Customer customer = findCustomer(customerName);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("Bank      : " + bankName);
        System.out.println("Customer  : " + customer.getCustomerName());
        System.out.println("========================================");

        List<Transaction> transactions = customer.getTransactions();

        double totalDeposits = 0;
        double totalWithdrawals = 0;

        for (int i = 0; i < transactions.size(); i++) {

            Transaction transaction = transactions.get(i);
            double amount = transaction.getAmount();

            if (transaction.isDeposit()) {
                System.out.printf("Deposit %-8d : +%.2f%n", i + 1, amount);
                totalDeposits += amount;
            } else {
                System.out.printf("Withdrawal %-4d : %.2f%n", i + 1, amount);
                totalWithdrawals += Math.abs(amount);
            }
        }

        System.out.println("----------------------------------------");
        System.out.printf("Total Deposits     : %.2f%n", totalDeposits);
        System.out.printf("Total Withdrawals  : %.2f%n", totalWithdrawals);
        System.out.printf("Current Balance    : %.2f%n", customer.getBalance());
        System.out.println("========================================");
    }

    private Customer findCustomer(String customerName) {

        for (Customer customer : customers) {

            if (customer.getCustomerName()
                    .equalsIgnoreCase(customerName.trim())) {

                return customer;
            }
        }

        return null;
    }

    public boolean customerExists(String customerName) {
        return findCustomer(customerName) != null;
    }

    public void listCustomers() {

        if (customers.isEmpty()) {
            System.out.println("\nNo customers found.");
            return;
        }

        System.out.println("\n============= Customers =============");

        for (int i = 0; i < customers.size(); i++) {

            System.out.printf("%d. %s%n",
                    i + 1,
                    customers.get(i).getCustomerName());

        }

        System.out.println("=====================================");
    }
}