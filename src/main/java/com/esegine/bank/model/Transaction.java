package com.esegine.bank.model;

import java.time.LocalDateTime;

public class Transaction {

    private final double amount;
    private final LocalDateTime transactionDate;

    public Transaction(double amount) {
        this.amount = amount;
        this.transactionDate = LocalDateTime.now();
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public boolean isDeposit() {
        return amount >= 0;
    }

    public boolean isWithdrawal() {
        return amount < 0;
    }
}