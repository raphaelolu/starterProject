package starter.project.domain;

import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Service
public interface Service extends JpaRepository<Car,Integer> {

}
