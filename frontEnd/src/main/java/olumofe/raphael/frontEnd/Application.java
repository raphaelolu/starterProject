package olumofe.raphael.frontEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import starterProject.App;
import starterProject.domain.Car;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

       List<Car> garage =  App.createCar();









        System.out.println("HELLLO");

    }
}
