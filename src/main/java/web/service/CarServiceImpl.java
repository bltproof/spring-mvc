package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarsByCount(List<Car> cars, int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}