package starterProject.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@JsonDeserialize
@NoArgsConstructor
@AllArgsConstructor
public class Engine {

    private int cylinders;
}