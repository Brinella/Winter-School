package Emma;

/**
 * Created by rodrique on 3/16/2018.
 */
public class Manager
{
    WorkInterface worker;

    public void setWorker(WorkInterface worker)
    {
        this.worker = worker;
    }

    public void manage()
    {
        worker.work();
    }
}
