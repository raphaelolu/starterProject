package starter.project.frontend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import starter.project.domain.Car;
import starter.project.domain.Doors;
import starter.project.domain.Engine;
import starter.project.domain.Wheels;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class CarControllerTest {

    CarController controller = new CarController();

    @Test
    public void newCarsAAreAddedToMap() {

        Car car = Car.builder().id(15).build();
        controller.addCar(car);
        assertEquals(1, controller.map.size());
        Car secondCar = Car.builder().id(13).build();
        controller.addCar(secondCar);
        System.out.println(controller.map);
        assertEquals(2, controller.map.size());
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
        controller.createCarList(list);
        assertEquals(list,controller.getBatchCars(idList));
    }
    @Test
    public void verifyCarPostedHasCorrectFields(){
        Car car = Car.builder().id(22).doors(Doors.builder().build()).name("rover").engine(Engine.builder().build()).wheels(Wheels.builder().build()).build();
        Car mockCar = Car.builder().id(22).doors(Doors.builder().build()).name("rover").engine(Engine.builder().build()).wheels(Wheels.builder().build()).build();
        controller.addCar(car);
        assertEquals(mockCar,controller.getCar(22));
    }
}




