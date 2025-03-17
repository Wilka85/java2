package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;


    public Tester(String name, String surname) {
        this(name, surname, 0, "Unknown", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate", 500.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }


    public void displayInfo() {
        System.out.println("Tester: " + name + " " + surname);
    }

    public void displayInfo(boolean showSalary) {
        System.out.println("Tester: " + name + " " + surname + ", Salary: " + (showSalary ? salary : "Hidden"));
    }

    public void displayInfo(boolean showSalary, boolean showExperience) {
        System.out.println("Tester: " + name + " " + surname +
                ", Experience: " + (showExperience ? experienceInYears + " years" : "Hidden") +
                ", Salary: " + (showSalary ? salary : "Hidden"));
    }


    public static void companyPolicy() {
        System.out.println("Все тестировщики должны обучаться.");
    }
}
