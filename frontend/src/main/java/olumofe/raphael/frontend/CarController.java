package olumofe.raphael.frontend;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import starter.project.domain.Car;

import java.util.*;

@RestController
@Component
public class CarController {


    private List<Car> carNewList = new ArrayList<>();

    @GetMapping(path ="/car/{carId}", consumes = {"application/json"})
    @ResponseBody
    public Car getCars(@PathVariable("carId") int carId) {

        for (Car car : carNewList) {
            if (car.getId() == (carId)) {
                Car returnedCar;
                returnedCar = car;
                return returnedCar;
            }
            }
          return null;
    }

    @GetMapping(path = "/cars", consumes = {"application/json"})
    @ResponseBody
    private List<Car> getBatchCars(@RequestBody List<Integer> list) {
        List<Car> newList = new ArrayList<>();
    for(int i= 0; i <= list.size() -1; i ++){
        if(carNewList.get(i).getId() == list.get(i)){
            Car car = carNewList.get(i);
            newList.add(car);
        }
    }
        return newList;

    }










}




