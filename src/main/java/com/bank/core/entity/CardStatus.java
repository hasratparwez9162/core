package com.bank.core.entity;

public enum CardStatus {
    ACTIVE,          // Card is active and usable
    BLOCKED,         // Card is blocked
    EXPIRED,         // Card has passed its expiry date
    PENDING_ACTIVATION,  // New card waiting to be activated
    SUSPENDED,       // Temporarily suspended
    CANCELLED        // Permanently cancelled
}
