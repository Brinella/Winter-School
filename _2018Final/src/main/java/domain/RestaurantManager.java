package domain;


import java.io.Serializable;
/**
 * Created by rodrique on 4/19/2018.
 */

public class RestaurantManager extends Employee implements Role  
{
    public String getJobDescription() 
    {
        return "Manages the restaurant, makes sure everyone is working an dbusiness is running smoothly";
    }
}
