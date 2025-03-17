package com.example.task3;

public class Minutes implements Time{
    private int minutes;

    public Minutes(int minutes) {
        this.minutes=minutes;
    }

    @Override
    public int getHours() {
        return 0;
    }

    @Override
    public int getMinutes() {
        return minutes;
    }
}
