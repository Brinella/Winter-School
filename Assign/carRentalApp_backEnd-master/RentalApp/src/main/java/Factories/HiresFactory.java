package Factories;

import Domain.Customer;
import Domain.Hires;

/**
 * Created by Emma on 8/11/2018.
 */
public class HiresFactory
{
    //Hires
    public static Hires getOrder(String hDate, Customer customer ) {

        Hires hired = new Hires.Builder()
                .customer(customer)
                .HiredDate(hDate)
                .build();
        return hired;
    }

}
