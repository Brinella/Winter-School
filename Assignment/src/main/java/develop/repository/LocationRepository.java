package repository;

import domain.Location;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rodrique on 8/14/2017.
 */
public class LocationRepository implements LocationInterface
{
    private static LocationRepository repository = null;

    private Map<String, Location> locationTable;
    private LocationRepository()
    {
        locationTable = new HashMap<String, Location>();
    }

    public static LocationRepository getInstance()
    {
        if(repository == null)
            repository = new LocationRepository();
        return repository;
    }

    public Location create(Location location)
    {
        locationTable.put(location.getAddress(),location);
        Location savedLocation = locationTable.get(location.getAddress());
        return savedLocation;
    }

    public Location read(String address)
    {
        Location location = locationTable.get(address);
        return location;
    }

    public Location update (Location location)
    {
        locationTable.put(location.getAddress(),location);
        Location savedLocation = locationTable.get(location.getAddress());
        return  savedLocation;
    }

    public void delete(String address)
    {
        locationTable.remove(address);
    }

}
