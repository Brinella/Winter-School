package Services.Impl;

import Domain.Car;
import Domain.Category;
import Repository.CarRepository;
import Services.CarServices;

/**
 * Created by Emma on 8/12/2018.
 */
//needs fixing
@Components
public class CarServicesImpl implements CarServices
{
    @Autowired
    private CarRepository carRepository;


    public Car create(Car car)
    {
        return carRepository.create(car);
    }


    public Car read(String id)
    {
        return carRepository.read(id);
    }


    public Car update(Car car) {
        return carRepository.update(car);
    }


    public void delete(String id)
    {
        carRepository.delete(id);
    }



    public Iterable<Car> readAll()
    {
        return carRepository.readAll();
    }


    public Iterable<Car> findAllById(Category category) {

        return carRepository.findAllById(category);
    }
}
