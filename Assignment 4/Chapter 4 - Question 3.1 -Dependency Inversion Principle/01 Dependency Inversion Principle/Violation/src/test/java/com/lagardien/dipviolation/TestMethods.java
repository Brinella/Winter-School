package com.lagardien.dipviolation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Ijaaz Lagardien
 * Group 3A
 * Dr B. Kabaso
 * Date: ${Date}.
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
