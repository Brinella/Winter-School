package com.Emma.Multimodules;

/**
 * Created by Long on 17/02/2018.
 */
public class Subtraction {

    private int int1;
    private int int2;

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setInt2(int int2) {
        this.int2 = int2;
    }

    public int getInt1() {
        return int1;
    }

    public int getInt2() {
        return int2;
    }

    public int subtract()
    {
        return int1 - int2;
    }
}
