package starter.project.frontend;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import starter.project.domain.Car;
import java.util.*;

@RestController
public class CarController {

    private List<Car> carNewList = new ArrayList<>();
    Map<String, Car> map = new HashMap<>();

    @PostMapping(path = "/car", consumes = {"application/json"})
    public List<Car> addCar(@RequestBody Car car) {
        carNewList.add(car);
        return carNewList;
    }

    @GetMapping(path = "/car/{carId}")
    public Car getCar(@PathVariable("carId") int carId) {

        for (Car car : carNewList) {
            if (car.getId() == (carId)) {
                return car;
            }
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "entity not found");
    }

    @GetMapping(path = "/cars/{list}")
    public List<Car> getBatchCars(@PathVariable List<String> list) {
        List<Car> newList = new ArrayList<>();
        for(String m : list) {
         newList.add(map.get(m));
        }
        return newList;
    }
    @PostMapping(path = "/cars", consumes = {"application/json"})
    public Map<String, Car> createCarList(@RequestBody List<Car> carList) {
        carNewList = carList;
        for (int i = 0; i < carList.size(); i++) {
            map.put(String.valueOf(i), carNewList.get(i));
        }
        return map;
    }
}

