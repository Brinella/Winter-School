package factories;

import domain.Order;

import java.util.Map;

/**
 * Created by rodrique on 4/20/2018.
 */
public class OrderFactory
{
    public static Order getMainCourse(Map<String,String> values)// , List<Chef> chefs)
    {
        Order mainCourse = new Order
                .Builder()
                //.orderNum(orderNum)
                .orderDate(values.get("order Date"))
                .build();
        return mainCourse;
    }
}
