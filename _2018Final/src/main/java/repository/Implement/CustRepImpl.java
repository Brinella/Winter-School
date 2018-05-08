package repository.Implement;

import domain.Customer;
import repository.CustomerRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rodrique on 5/8/2018.
 */
public class CustRepImpl implements CustomerRepository
{
    private static CustRepImpl respository = null;

    private Map<Long, Customer> custTable;

    private CustRepImpl() {
        custTable = new HashMap<Long, Customer>();
    }

    public static CustRepImpl getInstance() {
        if (respository == null)
            respository = new CustRepImpl();
        return respository;
    }

    public Customer create(Customer customer) {
        custTable.put(customer.getId(), customer);
        Customer savedCust = custTable.get(customer.getId());
        return savedCust;
    }

    public Customer read(String id) {
        Customer customer = custTable.get(id);
        return customer;
    }

    public Customer update(Customer customer) {
        custTable.put(customer.getId(), customer);
        Customer savedCust = custTable.get(customer.getId());
        return savedCust;
    }

    public void delete(String id) {
        custTable.remove(id);

    }
}
