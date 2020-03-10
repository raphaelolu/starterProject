package starterProject.domain;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Data @Builder public class Car {

    private Transmission transmission;
    private Wheels wheels;
    private Engine engine;
    private Doors doors;
    private String name;






}
