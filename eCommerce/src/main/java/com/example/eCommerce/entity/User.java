package com.example.eCommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "users_t")
@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String username;
    private String email;
    private String password;
}
