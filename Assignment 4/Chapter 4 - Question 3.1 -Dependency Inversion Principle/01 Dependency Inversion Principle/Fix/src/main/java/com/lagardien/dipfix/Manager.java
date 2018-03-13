package com.lagardien.dipfix;

/**
 * Ijaaz Lagardien
 * 214167542
 * Group 3A
 * Dr B. Kabaso
 * Date: 13 March 2016
 */

public class Manager
{
    WorkerInterface worker;

    public void setWorker(WorkerInterface worker)
    {
        this.worker = worker;
    }

    public void manage()
    {
        worker.work();
    }
}

