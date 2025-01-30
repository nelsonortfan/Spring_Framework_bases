package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cliente {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = applicationContext.getBean(Car.class);
        car.move();

        Bike bike1 = applicationContext.getBean(Bike.class);
        bike1.move();

        Traveler traveler2 = applicationContext.getBean(Traveler.class);
        traveler2.startJourney();

    }

}
