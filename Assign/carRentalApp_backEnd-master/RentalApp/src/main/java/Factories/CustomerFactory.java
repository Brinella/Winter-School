package Factories;

import Domain.Customer;

import java.util.Map;

/**
 * Created by Emma on 8/11/2018.
 */
public class CustomerFactory
{
    public static Customer getCustomer(Map<String, String> stringValues)
    {
        Customer customer = new Customer.Builder()
                .name(stringValues.get("name"))
                .surname(stringValues.get("surname"))
                .email(stringValues.get("email"))
                .address(stringValues.get("address"))
                .build();
        return customer;
    }

}
