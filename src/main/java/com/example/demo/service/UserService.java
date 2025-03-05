package com.example.demo.service;

import com.example.demo.model.User;
import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {
    private final ArrayList<User> users = new ArrayList<User>();

    public User addUser(String name, String email) {
        User user = new User(name, email);
        users.add(user);
        return user;
    }

    public User getUserById(int id) {
        if (id >= 0 && id < users.size()) {
            return users.get(id);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, id + " not found");
    }
}
