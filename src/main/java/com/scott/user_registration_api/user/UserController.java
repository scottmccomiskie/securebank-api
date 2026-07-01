package com.scott.user_registration_api.user;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController // handles HTTP requests
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    //"Run this method when a POST request arrives at /register."

    @PostMapping("/register")
        public RegisterResponse register(@Valid @RequestBody RegisterRequest registerRequest){
            return userService.registerUser(registerRequest);
        }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        return userService.loginUser(loginRequest);
    }

    //"@PathVariable Take a value from the URL and put it into a method parameter."
    @GetMapping("/users/email/{email}")
    public User findUser(@PathVariable String email) {
        return userService.findUserByEmail(email);
    }
}
