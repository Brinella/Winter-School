package repository;

import domain.Customer;

/**
 * Created by rodrique on 4/23/2018.
 */
public interface CustomerRepository
{
    Customer create(Customer customer);


    Customer read(String id);

    Customer update(Customer customer);

    void delete(String id);
}
