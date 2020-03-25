package olumofe.raphael.frontEnd;
import org.springframework.web.bind.annotation.*;
import starterProject.App;
import starterProject.domain.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
@org.springframework.stereotype.Controller

   @RestController
public class CarController {

    List<Car> carNewList = Arrays.asList();
    Car singlecar;
    @PostMapping(path= "/cars",consumes = {"application/json"})
    @ResponseBody
    public List<Car> createCarList(@RequestBody List<Car> carList){
       carNewList = carList;
       return carNewList;
    }
    @PostMapping(path = "/car",consumes = {"application/json"})
    @ResponseBody
    public Car car(Car car){
        singlecar = car;
        return car;
    }
}
