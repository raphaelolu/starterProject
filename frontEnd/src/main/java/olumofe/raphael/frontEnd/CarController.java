package olumofe.raphael.frontEnd;

import org.springframework.web.bind.annotation.*;
import starterProject.domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
@org.springframework.stereotype.Controller

public class CarController {

    Transmission automatic = Transmission.builder().automatic(true).build();
    Wheels parelli = Wheels.builder().wheels(4).build();
    Engine v12 = Engine.builder().cylinders(12).build();
    Doors verticalDoors = Doors.builder().doorNumbers(2).build();
    @PostMapping("/createCarList")
    @ResponseBody
    public List<Car> createCarList(){
        Car ferarri = Car.builder().transmission(automatic).wheels(parelli).engine(v12).doors(verticalDoors).name("ferrari").build();
        Car buggatti = Car.builder().transmission(automatic).wheels(parelli).engine(v12).doors(verticalDoors).name("bugatti").build();
        List <Car> objectList =  new ArrayList<Car>();
        objectList.add(ferarri);
        objectList.add(buggatti);
        return objectList;
    }
    @PostMapping("/car")
    @ResponseBody
    public Car car(){

        Car landRover = Car.builder().transmission(automatic).wheels(parelli).engine(v12).doors(verticalDoors).name("landrover").build();
        return landRover;

    }
}
