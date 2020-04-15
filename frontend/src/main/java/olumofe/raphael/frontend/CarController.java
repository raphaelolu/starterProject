package olumofe.raphael.frontend;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import starter.project.domain.Car;

import java.util.*;

@RestController
public class CarController {

    private List<Car> carNewList = new ArrayList<>();

    @PostMapping(path = "/car", consumes = {"application/json"})
    public List<Car> addCar(@RequestBody Car car) {
        carNewList.add(car);
        return carNewList;
    }
    @GetMapping(path = "/car/{carId}")
    public Car getCars(@PathVariable("carId") int carId) {
        for (Car car : carNewList) {
            if (car.getId() == (carId)) {
                Car returnedCar = car;
                return returnedCar;
            }
        }
        return null;
    }
    @GetMapping(path = "/cars/{list}")
    public List<Car> getBatchCars(@PathVariable List<Integer> list) {
        List<Car> newList = new ArrayList<>();
        for (int i = 0; i < carNewList.size(); i++)
        {
            for (int j = 0; j < list.size(); j++)
            {
                if(carNewList.get(i).getId() == (list.get(j)))
                {
                    Car car = carNewList.get(i);
                    newList.add(car);
                }
            }
        }
        return newList;
    }

    @PostMapping(path = "/cars", consumes = {"application/json"})
    public Map<String, Car> createCarList(@RequestBody List<Car> carList) {
        carNewList = carList;
        Map<String, Car> map = new HashMap<>();
        for (int i = 0; i < carList.size(); i++) {
            map.put(String.valueOf(i), carNewList.get(i));
        }
        return map;
    }


}




