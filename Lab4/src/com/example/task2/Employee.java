package com.example.task2;

public abstract class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculator();
}
