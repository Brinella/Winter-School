package Factories;

import Domain.Car;
import Domain.Hires;
import Domain.Rental;

import java.math.BigDecimal;

/**
 * Created by Emma on 8/11/2018.
 */
public class RentalFactory
{
    //Rental
    public static Rental getRent(Car car, String rentDate, String returnDate, BigDecimal totalPrice,
                                 Hires hire, int daysRented, boolean Amtoutstanding)
    {
        Rental rent = new Rental.Builder()
                .car(car)
                .rentDate(rentDate)
                .returntDate(returnDate)
                .daysRented(daysRented)
                .totalPrice(totalPrice)
                .Hired(hire)
                .amountOutstanding(Amtoutstanding)
                .build();
        return  rent;
    }

}
