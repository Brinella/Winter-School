package Emma;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by rodrique on 3/16/2018.
 */
public class Test
{
    private Manager manager;
    private MainWorker sWorker;
    private Worker worker;
    @org.junit.Before
    public void setUp() throws Exception {
        manager = new Manager();
        sWorker = new MainWorker();
        worker = new Worker();
    }

    @org.junit.Test
    public void testSetWorker() throws Exception
    {
        manager.setWorker(worker);
        Assert.assertEquals(worker,worker);
    }
}
