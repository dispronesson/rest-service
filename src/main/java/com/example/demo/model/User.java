package com.example.demo.model;

public class User {
    private String name;
    private int id;

    public User() {}

    public User(String name, int age) {
        this.name = name;
        this.id = age;
    }

    public User(String name, int age, int id) {
        this.name = name;
        this.id = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.id = age;
    }
}