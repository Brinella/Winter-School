package Repository;

import Domain.Car;
import Domain.Category;

/**
 * Created by Emma on 8/11/2018.
 */
public interface CarRepository extends CrudRepository <Car, Long>
{
    Car create(Car car1);
    Car read(String id);
    Car update(Car carDetails);
    void delete(String id);


    Iterable<Car> readAll();
    Iterable<Car> findAllById(Category category);;

}

