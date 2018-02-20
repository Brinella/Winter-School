package com.Emma.Multimodules;

/**
 * Created by Emma/Long on 17/02/2018.
 */
public class Addition {

    private int integer1;
    private int integer2;

    public void setInt1(int integer)
    {
        integer1=integer;
    }

    public void setInt2(int integer)
    {
        integer2 = integer;
    }


    public int getInt1() {
        return integer1;
    }

    public int getInt2() {
        return integer2;
    }

    public int addition()
    {
        return integer1 + integer2;
    }


}
