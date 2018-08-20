package Repository;

import Domain.Customer;

/**
 * Created by Emma on 8/11/2018.
 */
public interface CustomerRepository extends CrudRepository<Customer,Long>
{
    Customer create(Customer cust);
    Customer read(long id);
    Customer update(Customer cust);
    void delete(long id);
    Customer findByEmail(String email);
    }

