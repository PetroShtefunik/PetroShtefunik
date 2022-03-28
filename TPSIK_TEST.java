package LABS;
import static org.junit.Assert.*;

import org.junit.Test;

public class TPSIK_TEST {

    public static final double EPS = 0.1;
    @Test
    public void test1() {
        int[] arr = new int[] { 10, 5, 1, -2, -2};
        int expResult = 4;
        int result = Lab_1.dobutok(arr);
        assertEquals(expResult, result, EPS);

    }
}