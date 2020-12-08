package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam("count") int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMX X5", "suv", 220));
        cars.add(new Car("Porsche Cayenne", "suv", 250));
        cars.add(new Car("Audi RS6", "touring", 240));
        cars.add(new Car("Mercedes W223", "sedan", 230));
        cars.add(new Car("Lada Priora", "sedan", 180));

        model.addAttribute("cars", carService.getCarsByCount(cars, count));

        return "cars";
    }
}