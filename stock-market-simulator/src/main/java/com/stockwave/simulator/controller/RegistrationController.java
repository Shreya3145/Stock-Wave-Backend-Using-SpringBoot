package com.stockwave.simulator.controller;

import org.springframework.web.bind.annotation.*;
import com.stockwave.simulator.models.User;
import com.stockwave.simulator.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class RegistrationController {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }
}
