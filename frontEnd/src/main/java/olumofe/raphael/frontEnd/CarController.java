package olumofe.raphael.frontEnd;
import org.springframework.web.bind.annotation.*;
import starterProject.App;
import starterProject.domain.*;

import java.security.Key;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
@org.springframework.stereotype.Controller

   @RestController
public class CarController {

    List<Car> carNewList = Arrays.asList();
    @PostMapping(path= "/cars",consumes = {"application/json"})
    @ResponseBody
    public Map<Integer,Car> createCarList(@RequestBody List<Car> carList){
       carNewList = carList;
        HashMap<Integer,Car> map = new HashMap<Integer, Car>();
        for (Car i : carNewList) {
            map.put(carNewList.size(), i);
        }
       return map;
    }
    @PostMapping(path = "/car/",consumes = {"application/json"})
    @ResponseBody
    public List<Car> car(Car car){
        carNewList.add(carNewList.size()+1,car);
        return carNewList;
    }

}
