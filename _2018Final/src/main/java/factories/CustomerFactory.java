package factories;

import domain.Customer;

import java.util.Map;

/**
 * Created by rodrique on 4/23/2018.
 */
public class CustomerFactory
{
    public static Customer getCustomer(Map<String, String> values)
    {
        Customer customer = new Customer
                .Builder()
                .custNum(values.get("custNum"))
                .custName(values.get("custName"))
                .build();
        return customer;
    }
}
