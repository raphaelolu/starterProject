package starter.project.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@Builder
@JsonDeserialize
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Doors {
    private int Doors;
}
