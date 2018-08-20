package Services;

import Domain.Customer;
/**
 * Created by Emma on 8/12/2018.
 */
public interface CustomerServices
{
    Customer create(Customer cust1);
    Customer read(String id);
    Customer update(Customer carDetails);
    void delete(String id);
    Iterable<Customer> findAll();//finds all
    Customer availableEmail(String email);
}
