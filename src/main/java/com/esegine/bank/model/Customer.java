package com.esegine.bank.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String customerName;
    private final List<Transaction> transactions;

    public Customer(String customerName) {
        this.customerName = customerName.trim();
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(double amount) {
        transactions.add(new Transaction(amount));
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public double getBalance() {
        double balance = 0;

        for (Transaction transaction : transactions) {
            balance += transaction.getAmount();
        }

        return balance;
    }
}