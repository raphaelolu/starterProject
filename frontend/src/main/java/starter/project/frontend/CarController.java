package starter.project.frontend;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import starter.project.domain.Car;
import java.util.*;

@RestController
public class CarController {

    private List<Car> currentCarList = new ArrayList<>();
    Map<Integer, Car> map = new HashMap<>();

    @PostMapping(path = "/car", consumes = {"application/json"})
    public List<Car> addCar(@RequestBody Car car) {
        currentCarList.add(car);
        return currentCarList;
    }
    @GetMapping(path = "/car/{carId}")
    public Car getCar(@PathVariable("carId") int carId) {
        for (Car car : currentCarList) {
            if (car.getId() == (carId)) {
                return car;
            }
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "entity not found");
    }

    @GetMapping(path = "/cars/{list}")
    public List<Car> getBatchCars(@PathVariable List<Integer> list) {
        List<Car> newList = new ArrayList<>();
        for (int entry : list) {
            newList.add(map.get(entry));
        }
        return newList;
    }

    @PostMapping(path = "/cars", consumes = {"application/json"})
    public Map<Integer, Car> createCarList(@RequestBody List<Car> carList) {
        currentCarList = carList;
        for (int i = 0; i < carList.size(); i++) {
            map.put(i, currentCarList.get(i));
            currentCarList.get(i).setId(i);
        }
        return map;
    }

    @PutMapping(path = "car", consumes = {"application/json"})
    public Map<Integer, Car> updateCars(@RequestBody Car car) {
        Car entry = map.get(car.getId());
        entry = car;
        map.put(entry.getId(), entry);
        return map;
    }

    @PutMapping(path = "cars")
    public Map<Integer, Car> batchUpdateCars(@RequestBody Map<Integer, Car> m) {

        for (Map.Entry<Integer, Car> entry : m.entrySet()) {
            int key = entry.getKey();
            Car value = entry.getValue();
            Car updatedCar = map.get(key);
            updatedCar = value;
            map.put(key, updatedCar);
        }
        return map;
    }
}

