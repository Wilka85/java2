package com.example.task3;

public class Main {
    public static void main(String[] args) {
        Hours hours = new Hours(22);
        Minutes minutes = new Minutes(45);
        Day day = new Day(hours,minutes);
        day.displayTime();
        day.displayCurrentTime();
    }
}
