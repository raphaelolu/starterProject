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
    public Map<String,Car> createCarList(@RequestBody List<Car> carList){
       carNewList = carList;
        HashMap<String,Car> map = new HashMap<String, Car>();

        for (int i = 0; i < carList.size() ; i ++) {
            map.put(String.valueOf(i),carNewList.get(i));
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
