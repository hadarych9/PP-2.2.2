package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public static ArrayList<Car> getCarList(){
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford", "Focus", "123"));
        cars.add(new Car("Hyundai", "Solaris", "321"));
        cars.add(new Car("Kia", "Picanto", "213"));
        return cars;
    }
}
