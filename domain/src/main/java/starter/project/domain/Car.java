package starter.project.domain;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@JsonDeserialize
@Data @NoArgsConstructor @AllArgsConstructor
@Builder public class Car {
    @Id
    private int id;
    private Transmission transmission;
    private Wheels wheels;
    private Engine engine;
    private Doors doors;
    private String name;

}
