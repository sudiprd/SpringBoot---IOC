package com.example.springbootassignment1.engine;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    //Constructor DI
    private Engine engine;
    private Transmission transmission;

    @Autowired
    public Car(Engine engine, Transmission transmission){
        this.engine = engine;
        this.transmission = transmission;
    }

    public void getEngineDetails(){
        engine.engineDetails("1246", "145");
        engine.engineModel("V8");

    }

}
