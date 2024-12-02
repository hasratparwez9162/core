package com.bank.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardNotification {
    private String cardHolderName;
    private String cardNumber;
    private CardType cardType;
    private CardStatus status;
    private String message;
    private String email;
}
