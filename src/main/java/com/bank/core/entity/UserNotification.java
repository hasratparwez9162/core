package com.bank.core.entity;

import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserNotification {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private IsUserActive isActive;
    private String comments;
    private String applicationId;



}