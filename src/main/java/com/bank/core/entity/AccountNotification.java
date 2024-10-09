package com.bank.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountNotification {
    private String accountNumber;
    private BigDecimal balance;
    private LocalDate dateOpened;
    private Long userId;            // Reference to User ID from user-service
    private String userName;        // User's full name
    private String email;           // User's email
    private String phoneNumber;     // User's phone number
}
