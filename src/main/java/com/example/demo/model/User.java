package com.example.demo.model;

public class User {
    private String name;
    private String email;
    private int id;
    private static int counter = 0;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}