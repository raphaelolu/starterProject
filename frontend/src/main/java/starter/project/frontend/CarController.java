package starter.project.frontend;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import starter.project.domain.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CarController {
    private List<Car> carNewList = new ArrayList<>();

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
        return carNewList;
    }
}
