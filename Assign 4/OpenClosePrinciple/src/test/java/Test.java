import Emma.DriveConfrim;
import Emma.HondaCivic;

/**
 * Created by rodrique on 3/16/2018.
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test
{
    DriveConfrim dc;
    HondaCivic newOne;
    HondaCivic old;
    @Before
    public void setUp() throws Exception {
        dc = new DriveConfrim();
        newOne = new HondaCivic();
    }

    @Test
    public void testDrawShape() throws Exception {
        boolean test = false;
        try {
            dc.driveCar(newOne);
            test = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        Assert.assertTrue(test);
    }
}
