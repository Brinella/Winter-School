package repository;
import domain.Location;


/**
 * Created by rodrique on 8/11/2017.
 */
public interface LocationInterface
{
    Location create(Location location);
    Location read(String address);
    Location update(Location location);
    void    delete(String address);
}
