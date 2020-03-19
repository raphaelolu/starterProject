package olumofe.raphael.frontEnd;

import starterProject.domain.Car;


import java.util.List;

public class CarModel {

    private List<Car> carList;

    public CarModel(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
