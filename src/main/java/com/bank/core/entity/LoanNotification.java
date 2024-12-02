package com.bank.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanNotification {

    private BigDecimal loanAmount;

    private String loanNumber;

    private LoanType loanType;

    private BigDecimal interestRate;

    private int tenureMonths;

    private LocalDate startDate;

    private LocalDate endDate;

    private BigDecimal remainingBalance;

    private String loanStatus;
    private String username;
    private String email;
}
