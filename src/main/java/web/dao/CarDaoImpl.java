package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{
    private List<Car> carsList = new ArrayList<>();

    public List<Car> getAllCars() {
        carsList.add(new Car("BMW", "e53", 2001));
        carsList.add(new Car("Mercedes", "W220", 2003));
        carsList.add(new Car("Volvo", "s40", 1997));
        carsList.add(new Car("BMW", "e91", 2008));
        carsList.add(new Car("VolksWagen", "Jetta", 1991));
        return carsList;
    }
    @Override
    public List<Car> getCarsList(int count){
        getAllCars();
        return carsList.stream().limit(count).toList();
    }
}
