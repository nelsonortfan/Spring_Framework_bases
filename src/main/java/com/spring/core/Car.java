package com.spring.core;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Moving the car");
    }
}
