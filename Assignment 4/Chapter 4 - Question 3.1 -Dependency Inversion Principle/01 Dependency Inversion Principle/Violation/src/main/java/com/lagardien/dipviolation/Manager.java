package com.lagardien.dipviolation;

/**
 * Ijaaz Lagardien
 * Group 3A
 * Dr B. Kabaso
 * Date: 13 March 2016
 */
public class Manager
{
    Worker workerObject;

    public void setWorker(Worker workerObject)
    {
        this.workerObject = workerObject;
    }

    public void manage()
    {
        workerObject.work();
    }
}
