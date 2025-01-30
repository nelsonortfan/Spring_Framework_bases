package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveler {

    private Vehicle vehicle;

    @Autowired // inyectamos la dependencia de Cycle con su nombre de bean "cycle"
    public Traveler(@Qualifier("cycle") Vehicle vehicle){
        this.vehicle = vehicle;
    } // Usamos Qualifier porque hay multples bean de tipo Vehicle y se puede generar problemas

    public void startJourney(){
        this.vehicle.move();
    }

}
