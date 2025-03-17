package com.example.task2;

public class Main {
    public static void main(String[] args) {
        Employee workers = new FixedWorkers("AAA",200);
        System.out.println(workers.calculator());
        System.out.println("-----------");
        Employee W2 = new HoursWorkers("BBB",12);
        System.out.println(W2.calculator());
    }
}
