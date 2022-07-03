package com.syntax.Class23;

public class Car {

    void start(){
        System.out.println("Use keys to start me");
    }

    void stop(){
        System.out.println("Use break to stop me");
    }
    void park(){
        System.out.println("you can park me manually");
    }
}

class BMW extends Car{
    //control+ o to override methods

    @Override
    void start() {
            System.out.println("you c an use push start button to start me");
        }


    @Override
    void stop() {
        System.out.println("you can use auto breaks or manual brajes to stop me");
    }

    @Override
    void park() {
        System.out.println("you can use the auto parking feature to park me ");
    }

}

class Tesla extends Car {
    @Override
    void start() {
        System.out.println("you can start me from app");
    }

    @Override
    void stop() {
        System.out.println("you can use auto breaking to stop me ");
    }

    @Override
    void park() {
        System.out.println("i can park myself");
    }
}

class Toyota extends Car{

}