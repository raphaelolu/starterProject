package starter.project.frontend;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import starter.project.domain.Car;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AppConfig {
    @Bean
    public  Map<Integer, Car> map()
    {
        return  new HashMap<Integer, Car>() ;
    }
}

