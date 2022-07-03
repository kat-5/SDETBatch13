package com.Class25;

public interface Animal {
    void sleep();
    void eat();
}


interface Dog extends Animal{
    void Bark();
}

class Husky implements Dog {
    public void sleep() {
        System.out.println("Sleep 4 hours");
    }

    @Override
    public void eat() {

    }

    @Override
    public void Bark() {

    }
}