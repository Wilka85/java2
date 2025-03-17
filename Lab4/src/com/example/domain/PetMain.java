package com.example.domain;

public class PetMain {
    public static void main(String[] args) {
        Animal a;

        Spider s = new Spider("XXX");
        s.eat();
        s.walk();
        Cat c = new Cat("Tom");
        c.eat();
        c.walk();
        c.play();
        a = new Cat("BBB");
        a.eat();
        a.walk();
        Pet p;
        p = new Cat("VVv");
        p.setName("Mr. Whiskers");
        p.play();
        Fish f = new Fish("FFF");
        f.setName("Guppy");
        f.eat();
        f.walk();
        f.play();
        a = new Fish("RRR");
        a.eat();
        a.walk();
        Lemur l = new Lemur("C");
        l.play();
        l.walk();
        l.eat();

    }
}
