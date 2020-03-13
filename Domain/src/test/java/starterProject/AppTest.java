package starterProject;

import org.junit.jupiter.api.Test;
import starterProject.domain.Car;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {

    @Test
    public void isObjectsCreated(){
        App.createCar();
        List<Car> haveCarsBeenCreated = App.createCar();
        assertNotNull(haveCarsBeenCreated);
        assertEquals(3,haveCarsBeenCreated.size());
    }

}