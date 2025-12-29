package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    @Bean
    public Engine engine1(){
        Engine engine1 = new Engine();
        engine1.setType("Petrol");
        engine1.setModel("US Model");
        return engine1;
    }
    @Bean
    public Car car1(){
        Car car1 = new Car();
        car1.setColor("red");
        car1.setCompany("Mercedes");
        car1.setModel("Petrol");
        car1.setEngine(engine1());
        return car1;
    }
    @Bean
    //@Scope("prototype")
    public Car car2(){
        return new Car("yellow","Lamborghini","Gasoline",engine1());
    }
}
