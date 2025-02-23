package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public User getUser(@RequestParam(defaultValue = "Undefined") String name,
                        @RequestParam(defaultValue = "0") int id) {
        return new User(name, id);
    }

    @GetMapping("/{id}")
    public User getUserId(@PathVariable int id) {
        return new User("Undefined", id);
    }
}
