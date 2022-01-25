package com.example.springbootassignment1.engine;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    public void engineDetails(String cc, String hp){
        System.out.println("Details of Engine are available");
    }

    public void engineModel(String name ){
        System.out.println("Engine model are available here: ");
    }
}
