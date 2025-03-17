package com.example.task2;

public class HoursWorkers extends Employee {
    private double hours;

    public HoursWorkers(String name, double hours) {
        super(name);
        this.hours = hours;
    }

    @Override
    public double calculator() {
        return 20.8 * 8 * hours;
    }
}
