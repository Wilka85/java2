package com.example.domain;

public class Spider extends Animal implements Pet{
    String name;
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println(name + " любит играть с паутиной");
    }
    public Spider(String name)
    {
        this.name=name;
    }

}
