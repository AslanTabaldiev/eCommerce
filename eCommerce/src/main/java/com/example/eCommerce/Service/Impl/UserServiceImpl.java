package com.example.eCommerce.Service.Impl;

import com.example.eCommerce.Repository.UserRepository;
import com.example.eCommerce.Service.UserService;
import com.example.eCommerce.config.JwtService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder encoder;

}
