package domain;


import java.io.Serializable;
/**
 * Created by rodrique on 4/19/2018.
 */


public class Waiters extends Employee implements Role
{

    public String getJobDescription() {
        return "Serve designated tables, ensure customers are well taken care of";
    }
}