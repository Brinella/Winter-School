package factories;

import domain.Dessert;

import java.util.Map;

/**
 * Created by rodrique on 4/20/2018.
 */
public class DessertFactory
{
    public static Dessert getDessert(Map<String,String> values)// , List<Chef> chefs)
    {
        Dessert dessert = new Dessert
                .Builder()
                .dessertID(values.get("DessertId"))
                .foodItem(values.get("food Item"))


                .build();
        return dessert;
    }
}
