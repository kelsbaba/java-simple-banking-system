package com.esegine.bank.service;

import com.esegine.bank.exception.CustomerAlreadyExistsException;
import com.esegine.bank.exception.CustomerNotFoundException;
import com.esegine.bank.model.Bank;

public class BankService {

    private final Bank bank;

    public BankService(String bankName) {
        this.bank = new Bank(bankName);
    }

    public void addCustomer(String customerName) {

        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be empty.");
        }

        if (bank.customerExists(customerName)) {
            throw new CustomerAlreadyExistsException(
                    "Customer '" + customerName + "' already exists.");
        }

        bank.addCustomer(customerName);
    }

    public void addTransaction(String customerName, double amount) {

        if (!bank.customerExists(customerName)) {
            throw new CustomerNotFoundException(
                    "Customer '" + customerName + "' was not found.");
        }

        bank.addTransaction(customerName, amount);
    }

    public void printStatement(String customerName) {
        bank.printStatement(customerName);
    }

    public void listCustomers() {
        bank.listCustomers();
    }
}