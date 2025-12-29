package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    @Value("${engine.engineType}")
    private String engineType;
    @Value("${engine.enginePower}")
    private String enginePower;

    public Engine() {}

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public void display() {
        System.out.println("Engine Type: " + engineType + ", Engine Power: " + enginePower);
    }
}