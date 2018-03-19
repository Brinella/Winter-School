package Emma;

/**
 * Created by rodrique on 3/16/2018.
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class Test
{
    public class TestMethods {
        HisenseTv tv;
        LCD lcd;

        public TestMethods() {
        }

        @Before
        public void setUp() throws Exception {
            this.tv = new HisenseTv();

            this.lcd = new LCD();
        }

        @Test
        public void testSetWidth() throws Exception {
            this.tv.setWidth(25);

            Assert.assertEquals(25L, 25L);

            this.lcd.setWidth(27);

            Assert.assertEquals(27L, 27L);
        }

        @Test
        public void testSetHeight() throws Exception {
            this.tv.setHeight(25);

            Assert.assertEquals(25L, 25L);

            this.lcd.setHeight(93);

            Assert.assertEquals(93L, 93L);
        }

        @Test
        public void testGetWidth() throws Exception {
            this.lcd.setWidth(25);

            Assert.assertEquals(25L, (long)this.lcd.getWidth());

        }

        @Test
        public void testGetHeight() throws Exception {
            this.lcd.setHeight(93);

            Assert.assertEquals(93L, (long)this.lcd.getHeight());
        }

        @Test
        public void testGetArea() throws Exception {
            this.lcd.setWidth(5);

            this.lcd.setHeight(10);

            Assert.assertEquals(50L, (long)this.lcd.getArea());
        }
    }

}
