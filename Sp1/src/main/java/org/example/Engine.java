package org.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Engine {
    String type;
    String model;
    public Engine() { }
    public Engine(String type, String model) {
        this.type = type;
        this.model = model;
    }
    public void display(){
        System.out.println("Engine Model: " + model +" Type: " + type);
    }
}
