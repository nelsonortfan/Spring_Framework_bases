package com.spring.core;

import org.springframework.stereotype.Component;

@Component  // Se usa esta anotacion para convertir la clase en un Bean. Por default se crea con el nombre de la clase con la primera letra en minuscula
public class Bike implements Vehicle{
    @Override
    public void move() {
        System.out.println("Moving the bike");
    }
}
