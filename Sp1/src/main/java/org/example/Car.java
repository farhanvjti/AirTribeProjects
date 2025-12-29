package org.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Car {
    String color;
    String company;
    String model;
    //Dependency Injection of Engine into the Car.
    //Car has-a Engine (Composition or Aggregation)-Association relationship.
    Engine engine;
    public Car(){}
    public Car(String color, String company, String model, Engine engine) {
        this.color = color;
        this.company = company;
        this.model = model;
        this.engine = engine;
    }
    public void display(){
        System.out.println("Car Details: " + company + " " + model +
                " " + color+ " "+ engine.model + " "+ engine.type);
    }
}
