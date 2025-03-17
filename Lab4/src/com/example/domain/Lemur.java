package com.example.domain;

public class Lemur extends Animal implements Pet {
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
        System.out.println(name + " любит лемурчать");
    }
    public Lemur(String name)
    {
        this.name=name;
    }
}
