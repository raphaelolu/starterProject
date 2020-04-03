package olumofe.raphael.frontEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import starterProject.App;
import starterProject.domain.*;
import java.security.Key;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
@org.springframework.stereotype.Controller
   @RestController
public class CarController {


    private List<Car> newCar=  new ArrayList<>();

    @ResponseBody
    @GetMapping("/cat")
    public String hello() {
        return "Hello Controller";
    }

    List<Car> carNewList =  new ArrayList<>();
    @PostMapping(path= "/cars",consumes = {"application/json"})
    @ResponseBody
    public Map<String,Car> createCarList(@RequestBody List<Car> carList){
       carNewList = carList;
        Map<String,Car> map = new HashMap<String, Car>();
        for (int i = 0; i < carList.size() ; i ++) {
            map.put(String.valueOf(i),carNewList.get(i));
            System.out.println(map.keySet());
        }
        return map;
    }
    @PostMapping(path = "/car",consumes = {"application/json"})
    @ResponseBody
    public List<Car> car(@RequestBody Car car){
        carNewList.add(car);
        return carNewList;
    }
}