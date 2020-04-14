package starter.project.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import starter.project.domain.Car;

import javax.persistence.Id;
import javax.sql.DataSource;
import java.util.*;

@org.springframework.stereotype.Controller
@RestController
@Component
public class CarController {
    private  List<Car> carNewList = new ArrayList<>();

    @Autowired
    Ser repo;

    @PostMapping(path = "/cars", consumes = {"application/json"})
    @ResponseBody
    public Map<String, Car> createCarList(@RequestBody List<Car> carList) {
        carNewList = carList;
        Map<String, Car> map = new HashMap<String, Car>();
        for (int i = 0; i < carList.size(); i++) {
            map.put(String.valueOf(i), carNewList.get(i));
            System.out.println(map.keySet());
        }
        return map;
    }

    @PostMapping(path = "/car", consumes = {"application/json"})
    @ResponseBody
    public List<Car> car(@RequestBody Car car) {
        carNewList.add(car);
//        repo.save(car);
        return carNewList;
    }

    @DeleteMapping("/carDelete/{carId}")
    public void deleteObject(@PathVariable int carId) {
//        Car car = repo.getOne(carId);
//        repo.delete(car);

    }

    @PutMapping(path = "/Car", consumes = {"application/json"})
    public Car updateCar(@RequestBody Car car) {git
//        repo.save(car);
        return car;
    }

}




