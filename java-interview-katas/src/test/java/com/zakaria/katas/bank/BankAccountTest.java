package com.zakaria.katas.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class BankAccountTest {
    @Test void depositAppearsInStatement() {
        BankAccount account = new BankAccount();
        account.deposit(1000, LocalDate.of(2026, 1, 10));
        assertTrue(account.printStatement().contains("1000"));
    }
    // Next: withdrawal, balance, reverse chronological statement.
}
