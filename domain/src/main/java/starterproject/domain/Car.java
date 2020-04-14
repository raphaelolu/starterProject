package starterproject.domain;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.*;


@JsonDeserialize
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
public class Car {
 // @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Id
  private Integer id;
    private Transmission transmission;
    private Wheels wheels;
    private Engine engine;
    private Doors doors;
    private String name;

}
