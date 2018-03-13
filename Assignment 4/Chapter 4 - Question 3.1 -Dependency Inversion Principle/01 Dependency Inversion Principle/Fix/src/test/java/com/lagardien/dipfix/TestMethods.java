package com.lagardien.dipfix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Ijaaz Lagardien
 * 214167542
 * Group 3A
 * Dr B. Kabaso
 * Date: 13 March 2016
 */
public class TestMethods
{
    private Manager manager;
    private SuperWorker sWorker;
    private Worker worker;
    @org.junit.Before
    public void setUp() throws Exception {
        manager = new Manager();
        sWorker = new SuperWorker();
        worker = new Worker();
    }

    @org.junit.Test
    public void testSetWorker() throws Exception
    {
        manager.setWorker(worker);
        Assert.assertEquals(worker,worker);
    }
}
