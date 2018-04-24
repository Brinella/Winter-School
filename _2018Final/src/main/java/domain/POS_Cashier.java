package domain;


import java.io.Serializable;
/**
 * Created by rodrique on 4/19/2018.
 */

public class POS_Cashier extends Employee implements Role 
{
    public String getJobDescription() 
    {
        return "Cashier is responsible for recording all transactions and ensuring accurate stock take";
    }
}