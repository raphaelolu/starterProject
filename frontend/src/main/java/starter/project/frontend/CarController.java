package starter.project.frontend;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import starter.project.domain.Car;
import java.util.*;

@RestController
public class CarController {
    Map<Integer, Car> map = new HashMap<>();
    @PostMapping(path = "/car", consumes = {"application/json"})
    public Map<Integer,Car> addCar(@RequestBody Car car) {
        map.put(car.getId(),car);
        return map;
    }

    @GetMapping(path = "/car/{carId}")
    public Car getCar(@PathVariable("carId") int carId) {

     Car car =  map.get(carId);
                return car;
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

        for (int i = 0; i < carList.size(); i++) {
            map.put(carList.get(i).getId(), carList.get(i));
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

   @DeleteMapping(path = "car/{carId}")
    public Map<Integer, Car> deleteCar(@PathVariable int carId) {
            map.entrySet().removeIf(e -> carId == e.getKey());
            return map;
        }

    @DeleteMapping(path = "cars/{list}")
    public Map<Integer,Car> batchDeleteCars(@PathVariable List<Integer> list)
    {
        for (int key : list) {
            map.remove(key);
        }
        return map;
    }
}

