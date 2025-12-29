package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test{
    public static void main(String[] args){
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("AppConfig.xml");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //To avoid ambiguity when multiple beans are defined in Spring.xml or in AppConfig.xml use (id,Car.class)
        Car car0 = (Car) ctx.getBean("car1",Car.class);
        car0.display();
        Car car1 = (Car) ctx.getBean("car1",Car.class);
        car1.display();
        //if scope is not set- it is singleton by default.
        //To explain Singleton scope of objects in Spring and Spring boot.
        //This is bcz controller needs to be initialized only once as the DB connection needs to happen only once.
        System.out.println("------Displaying Hashcodes------");
        System.out.println("Hashcode car2="+car0.hashCode());
        System.out.println("Hashcode car3="+car1.hashCode());

        Car car2 = (Car) ctx.getBean("car2",Car.class);
        car2.display();

        //With scope=prototype
        Car car3 = (Car) ctx.getBean("car2",Car.class);
        car3.display();
        System.out.println("------Displaying Hashcodes------");
        System.out.println("Hashcode car2="+car2.hashCode());
        System.out.println("Hashcode car3="+car3.hashCode()); //Different hashcodes, scope is explicit-prototype.

    // Engine Type object creation
        System.out.println("------Engine Object Creation------");
        Engine engine0 = (Engine) ctx.getBean("engine1",Engine.class);
        engine0.display();


    }
}