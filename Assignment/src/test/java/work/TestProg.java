package work;
/**
 * Created by rodrique on 9/7/2017.
 */
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class TestProg extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }

}
