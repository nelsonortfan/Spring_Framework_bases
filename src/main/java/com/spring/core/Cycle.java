package com.spring.core;

import org.springframework.stereotype.Component;

@Component
public class Cycle implements Vehicle{
    @Override
    public void move() {
        System.out.println("Moving Cycle");
    }
}
