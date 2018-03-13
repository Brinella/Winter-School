package com.lagardien.dipfix;

/**
 * Ijaaz Lagardien
 * 214167542
 * Group 3A
 * Dr B. Kabaso
 * Date: 13 March 2016
 */
public class RunDip
{
    public static void main(String[] args)
    {
        WorkerInterface worker = new Worker();
        WorkerInterface superWorker = new SuperWorker();
        Manager manager = new Manager();
        manager.setWorker(worker);
        manager.manage();
        manager.setWorker(superWorker);
        manager.manage();
    }
}
