package com.example.task3;

public class Day implements Divider {
    private final Hours hours;
    private final Minutes minutes;

    public Day(Hours hours, Minutes minutes) {

        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String getSutki(int hours) {
        if (hours >= 6 && hours < 12) {
            return "Morning";
        } else if (hours >= 12 && hours < 18) {
            return "Day";
        } else if (hours >= 18 && hours < 24) {
            return "Evening";
        } else {
            return "Night";
        }
    }

    public void displayTime() {

        int hour = hours.getHours();
        String sutki = getSutki(hour);
        System.out.println(sutki);
    }

    public void displayCurrentTime() {

        System.out.println(hours.getHours());
        System.out.println(minutes.getMinutes());
    }
}
