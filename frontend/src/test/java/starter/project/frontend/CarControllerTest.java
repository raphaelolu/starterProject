package starter.project.frontend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import starter.project.domain.Car;
import starter.project.domain.Doors;
import starter.project.domain.Engine;
import starter.project.domain.Wheels;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarControllerTest {
    Map<Integer, Car> map = new HashMap<>() {
    };

    CarController underTest = new CarController(map);

    @Test
    public void newCarsAAreAddedToMap() {

        Car car = Car.builder().id(15).build();
        underTest.addCar(car);
        assertEquals(1, map.size());
        Car secondCar = Car.builder().id(13).build();
        underTest.addCar(secondCar);
        System.out.println(map);
        assertEquals(2, map.size());
    }
    @Test
    public void listOfCarsShouldbeAddedToMap(){
        Car car = Car.builder().id(22).build();
        Car secondCar = Car.builder().id(33).build();
        Car thirdCar = Car.builder().id(19).build();
        List<Car> list = new ArrayList<>();
        list.add(car);
        list.add(secondCar);
        list.add(thirdCar);
        List<Integer> idList = new ArrayList<>();
        idList.add(22);
        idList.add(33);
        idList.add(19);
        underTest.createCarList(list);
        assertEquals(list,underTest.getBatchCars(idList));
    }
    @Test
    public void verifyCarHasCorrectFields(){
        Car car = Car.builder().id(22).doors(Doors.builder().build()).name("rover").engine(Engine.builder().build()).wheels(Wheels.builder().build()).build();
        underTest.addCar(car);
        assertEquals(car,underTest.getCar(22));
    }

    @Test
    public void verifyCarisDeleted(){
        Car car = Car.builder().id(22).doors(Doors.builder().build()).name("rover").engine(Engine.builder().build()).wheels(Wheels.builder().build()).build();
        underTest.addCar(car);
        underTest.deleteCar(22);
        assertEquals(0,map.size());
    }

    @Test
    public void verifyListOfObjectsIsDeleted(){
        Car car = Car.builder().id(22).build();
        Car secondCar = Car.builder().id(33).build();
        Car thirdCar = Car.builder().id(19).build();
        Car fourthCar = Car.builder().id(60).build();
        List<Car> list = new ArrayList<>();
        list.add(car);
        list.add(secondCar);
        list.add(thirdCar);
        list.add(fourthCar);
        List<Integer> carsTobeDeleted  = new ArrayList<>();
        carsTobeDeleted.add(22);
        carsTobeDeleted.add(33);
        carsTobeDeleted.add(19);
        underTest.createCarList(list);
        underTest.batchDeleteCars(carsTobeDeleted);
        assertEquals(1,map.size());

    }
    @Test
    public void addsOneCarToMap(){
        Car car = Car.builder().id(22).build();
        underTest.addCar(car);
        assertEquals(1,map.size());
    }

    @Test
    public void addsTwoCarsToList(){
        Car car = Car.builder().id(22).build();
        underTest.addCar(car);
        Car secondCar = Car.builder().id(23).build();
        underTest.addCar(secondCar);
        assertEquals(2,map.size());
    }
    @Test
    public void verifyCarsAreAddedCorrectlyToMap(){
        Car car = Car.builder().id(22).build();
        underTest.addCar(car);
        assertNotNull(map.get(22));
    }
}




