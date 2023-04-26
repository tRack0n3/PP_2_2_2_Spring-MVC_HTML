package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("BMW", "X6", 2019));
        carList.add(new Car("Mercedes-Benz", "S-500", 2011));
        carList.add(new Car("Ferrari", "F8-Spider",2021));
        carList.add(new Car("Audi", "A7",2018));
        carList.add(new Car("Ford", "GT",2006));
    }

    @Override
    public List<Car> getCar(int quantity) {
        return carList.stream().limit(quantity).collect(Collectors.toList());
    }

}
