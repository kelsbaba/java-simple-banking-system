package com.esegine.bank.service;

import com.esegine.bank.exception.CustomerAlreadyExistsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankServiceTest {

    @Test
    void shouldAddCustomerSuccessfully() {

        // Arrange
        BankService bankService = new BankService("Access Bank");

        // Act & Assert
        assertDoesNotThrow(() ->
                bankService.addCustomer("Kelly"));
    }

    @Test
    void shouldThrowExceptionWhenCustomerAlreadyExists() {

        // Arrange
        BankService bankService = new BankService("Access Bank");

        bankService.addCustomer("Kelly");

        // Act & Assert
        assertThrows(
                CustomerAlreadyExistsException.class,
                () -> bankService.addCustomer("Kelly")
        );
    }
}