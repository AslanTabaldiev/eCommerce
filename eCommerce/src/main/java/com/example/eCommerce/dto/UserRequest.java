package com.example.eCommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRequest {

    private String username;
    private String email;
    private String password;

}
