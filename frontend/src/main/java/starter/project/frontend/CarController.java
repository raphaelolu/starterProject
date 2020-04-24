package starter.project.frontend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import starter.project.domain.Car;
import starter.project.domain.Service;

import java.util.*;

@RestController
public class CarController {
    @Autowired
    Service repo;

    @PutMapping(path="/car",consumes = {"application/json"})
    @ResponseBody
    public Car updateCar(@RequestBody Car car ){
        repo.save(car);
        return car;
    }

    @PutMapping(path="/cars",consumes = {"application/json"})
    @ResponseBody
    public List<Car> updateCars(@PathVariable List<Car> list){
        repo.saveAll(list);
        return list;

    }

    @DeleteMapping("/car/{carId}")
    public void deleteCar(@PathVariable int carId) {
        Car car = repo.getOne(carId);
        repo.delete(car);
    }

    @DeleteMapping("/cars/{list}")
    public void deleteCars(@PathVariable List<Car> list){
        repo.deleteInBatch(list);
    }

    @GetMapping("/cars")
    public List<Car> getCars(){
        return  repo.findAll();
    }

    @GetMapping("car/{carId}")
    public Optional<Car> getCar(@PathVariable("carId")int carId){
        return  repo.findById(carId);
    }

    @PostMapping(path = "/cars",consumes = {"application/json"})
    public void createCarLists(List<Car> car)
    {
        repo.saveAll(car);
    }

    @PostMapping(path ="/car" ,consumes = {"application/json"})
    public Car createCar(@RequestBody Car car){
        repo.save(car);
        return car;
    }

}

