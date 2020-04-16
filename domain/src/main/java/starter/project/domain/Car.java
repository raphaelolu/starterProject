package starter.project.domain;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@JsonDeserialize
@Data @NoArgsConstructor @AllArgsConstructor
@Builder

public class Car {
    private Transmission transmission;
    private Wheels wheels;
    private Engine engine;
    private Doors doors;
    private String name;
    private int id;
}
