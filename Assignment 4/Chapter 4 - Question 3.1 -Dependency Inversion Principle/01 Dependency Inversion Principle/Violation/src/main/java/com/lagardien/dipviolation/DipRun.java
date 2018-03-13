package com.lagardien.dipviolation;

/**
 * Ijaaz Lagardien
 * Group 3A
 * Dr B. Kabaso
 * 13 March 2016
 */
public class DipRun
{
    public static void main(String[] args)
    {
        Manager managerObject = new Manager();
        Worker workerObject = new Worker();
        SuperWorker superWorkerObject = new SuperWorker();

        managerObject.setWorker(workerObject);
        managerObject.manage();
        superWorkerObject.work();
    }
}
