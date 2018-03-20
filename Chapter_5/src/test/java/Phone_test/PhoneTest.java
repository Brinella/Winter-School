package Phone_test;

/**
 * Created by rodrique on 3/20/2018.
 */
import Phone_brands.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PhoneTest
{
    private SamsungFactory sFactory = new SamsungFactory();

    private PhoneBuilder pBuild = new PhoneBuilder();

    private SamsungInterface sInterface;

    private PhoneInterface pInterface;

    private Boolean changesMade = false;

    @Before
    public void setUp() throws Exception {
        try{
            sInterface = SamsungType.getphoneMod("S1");
            sInterface = SamsungType.getphoneMod("S2");
            sInterface = SamsungType.getphoneMod("S3");
            sInterface = SamsungType.getphoneMod("S5");
            sInterface = SamsungType.getphoneMod("S6");
            sInterface = SamsungType.getphoneMod("S7");

            sInterface = SamsungFactory.getPhone("Samsung");

            pInterface = pBuild.phoneInfo();


            sInterface = new Samsung();


        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    @Test
    public void testForObjectCreation() throws Exception {
        try{
            Assert.assertSame(sInterface,sInterface);

        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    @Test
    public void testForChanges() throws Exception {
        try{
            pInterface.setPhone_brand("Samsung s1");
            pInterface.setPhone_brand("Samsung s2");
            pInterface.setPhone_brand("Samsung s3");
            pInterface.setPhone_brand("Samsung s5");
            pInterface.setPhone_brand("Samsung s6");
            pInterface.setPhone_brand("Samsung s7");
            Assert.assertEquals("Samsung s1",pInterface.getphone_brand());
            Assert.assertEquals("Samsung s2",pInterface.getphone_brand());
            Assert.assertEquals("Samsung s3",pInterface.getphone_brand());
            Assert.assertEquals("Samsung s5",pInterface.getphone_brand());
            Assert.assertEquals("Samsung s6",pInterface.getphone_brand());
            Assert.assertEquals("Samsung s7",pInterface.getphone_brand());

            changesMade = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            Assert.assertTrue(changesMade);
        }

    }
}
