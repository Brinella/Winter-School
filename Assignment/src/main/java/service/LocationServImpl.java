package service;

import domain.Location;
import repository.LocationInterface;
import repository.LocationRepository;

/**
 * Created by rodrique on 8/14/2017.
 */
public class LocationServImpl implements LocationService
{
    private static LocationServImpl service = null;

    LocationInterface repository = LocationRepository.getInstance();

    public static LocationServImpl getInstance()
    { if(service == null)
        service = new LocationServImpl();
        return service;
    }

    public Location create(Location location)
    { return repository.create(location);}

    public Location read(String address)
    {return repository.read(address);}

    public Location update(Location location)
    {return repository.update(location);}

    public void delete(String address)
    {repository.delete(address);}
}
