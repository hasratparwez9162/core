package com.bank.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationRequest {
    private String firstName;
    private String lastName;
    private  String email;
    private String password;
    private String accountNumber;
    private String username;
}
