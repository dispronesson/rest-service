package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser(String name, int id) {
        return new User(name, id);
    }

    public User getUserById(int id) {
        return new User("Undefined", id);
    }
}
