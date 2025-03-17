package com.example.task3;

public class Hours implements Time{
    private int hours;

    public Hours(int hours) {
        this.hours=hours;
    }

    @Override
    public int getHours() {
        return hours;
    }

    @Override
    public int getMinutes() {
        return 0;
    }
}
