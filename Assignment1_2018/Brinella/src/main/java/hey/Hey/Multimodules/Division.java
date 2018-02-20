package com.Emma.Multimodules;

/**
 * Created by Emma/Long on 17/02/2018.
 */
public class Division {

    private int integer1;
    private int integer2;

    public void setInteger1(int integer1) {
        this.integer1 = integer1;
    }

    public void setInteger2(int integer2)
    {
        this.integer2 = integer2;
    }

    public int getInteger1() {
        return integer1;
    }

    public int getInteger2() {
        return integer2;
    }

    public int divide()
    {
        return integer1/integer2;
    }
}
