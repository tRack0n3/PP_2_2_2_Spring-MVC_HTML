package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarDao carDao;

    @Override
    public List<Car> getCar(int quantity) {
        return carDao.getCar(quantity);
    }
}
