package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public User getUser(@RequestParam(defaultValue = "Undefined") String name,
                        @RequestParam(defaultValue = "0") int id) {
        return userService.getUser(name, id);
    }

    @GetMapping("/{id}")
    public User getUserId(@PathVariable int id) {
        return userService.getUserById(id);
    }
}
