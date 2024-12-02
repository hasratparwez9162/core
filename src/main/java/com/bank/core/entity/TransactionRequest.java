package com.bank.core.entity;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class TransactionRequest {
    private String accountNumber;  // Account number
    private String fromAccount;    // Source account for withdrawal
    private String toAccount;      // Destination account for credit
    private BigDecimal amount;
    private TransactionType type;   // Enum for "WITHDRAW" or "CREDIT"
    private String userName;       // User's full name
    private String email;          // User's email
    private BigDecimal balanceAfterTransaction;
}
