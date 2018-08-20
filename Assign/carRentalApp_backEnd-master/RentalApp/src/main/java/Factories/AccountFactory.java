package Factories;

import Domain.Account;
import Domain.Customer;

/**
 * Created by Emma on 8/11/2018.
 */
public class AccountFactory
{
    //AccountFactory
    public  static Account getAccount(Customer cust)
    {
        Account acc = new Account.Builder()
                .customer(cust)
                .build();
        return acc;
    }

}
