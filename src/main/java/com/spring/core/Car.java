package com.spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  // Se usa esta anotacion para que de multiples beans se tome este como el de mayor prioridad
public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Moving the car");
    }
}
