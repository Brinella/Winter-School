package Services;

import Domain.Car;
import Domain.Category;
/**
 * Created by Emma on 8/12/2018.
 */
public interface CarServices
{
    Car create(Car car1);
    Car read(String id);
    Car update(Car carDetails);
    void delete(String id);


    Iterable<Car> readAll();
    Iterable<Car> findAllById(Category category);//finds single
}
