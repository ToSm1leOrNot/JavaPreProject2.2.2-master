package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
private static final List<Car> cars = new ArrayList<>();
    {
        cars.add(new web.models.Car("Lambo", "Yellow" , 200000));
        cars.add(new web.models.Car("Tesla", "Gray" , 300000));
        cars.add(new web.models.Car("Mers", "Black" , 400000));
        cars.add(new web.models.Car("Audi", "Red" , 500000));
        cars.add(new web.models.Car("BMW", "White" , 600000));
    }
    @Override
    public List<Car> getCars(int count) {
        if(count ==0 || count == 5) {
            return cars;
        } else {
            if (count < 0 || count > 5)
                return null;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
