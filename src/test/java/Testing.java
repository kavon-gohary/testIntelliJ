import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by osasa on 11/06/17.
 */
public class Testing {

    public static int x = 3;
    public static int y = -1;

    @Test
    public void testSum() throws Exception {
        assertEquals(2, x+y);
    }

    @Test
    public void testTruth() throws Exception {
        assertTrue(5!=5);
    }
}