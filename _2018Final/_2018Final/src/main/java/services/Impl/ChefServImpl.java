package services.Impl;

import services.ChefService;
import domain.Chef;
import repository.ChefRepository;

import java.util.Set;

/**
 * Created by rodrique on 5/8/2018.
 */
public class ChefServImpl implements ChefService
{
    private static ChefServImpl service = null;

    ChefRepository repository = (ChefRepository) ChefServImpl.getInstance();

    public static ChefServImpl getInstance()
    { if(service == null)
        service = new ChefServImpl();
        return service;
    }

    public Chef create(Chef chef)
    { return repository.create(chef);}

    public Chef readById(Long aLong) {
        return null;
    }

    public Set<Chef> readAll() {
        return null;
    }

    public Chef read(String id)
    {return repository.read(id);}

    public Chef update(Chef chef)
    {return repository.update(chef);}

    public void delete(Chef entity) {

    }

    public void delete(String id)
    {repository.delete(id);}
}
