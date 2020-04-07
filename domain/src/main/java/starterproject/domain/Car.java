package starterproject.domain;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@JsonDeserialize
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
public class Car {
   @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
    private  transient Transmission transmission;
    private transient Wheels wheels;
    private transient Engine engine;
    private  transient Doors doors;
    private transient String name;

}
