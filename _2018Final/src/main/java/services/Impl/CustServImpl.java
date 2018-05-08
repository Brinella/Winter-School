package services.Impl;

import domain.Customer;
import repository.CustomerRepository;
import services.CustomerService;

import java.util.Set;

/**
 * Created by rodrique on 5/8/2018.
 */
public class CustServImpl implements CustomerService
{
    private static CustServImpl service = null;

    CustomerRepository repository = (CustomerRepository) CustServImpl.getInstance();

    public static CustServImpl getInstance()
    { if(service == null)
        service = new CustServImpl();
        return service;
    }

    public Customer create(Customer cust)
    { return repository.create(cust);}

    public Customer readById(Long aLong) {
        return null;
    }

    public Set<Customer> readAll() {
        return null;
    }

    public Customer read(String id)
    {return repository.read(id);}

    public Customer update(Customer cust)
    {return repository.update(cust);}

    public void delete(Customer entity) {

    }

    public void delete(String id)
    {repository.delete(id);}
}

