package Emma;

/**
 * Created by rodrique on 3/16/2018.
 */
public class Run
{
    public static void main(String[] args)
    {
        WorkInterface worker = new Worker();
        WorkInterface superWorker = new MainWorker();
        Manager manager = new Manager();
        manager.setWorker(worker);
        manager.manage();
        manager.setWorker(superWorker);
        manager.manage();
    }
}
