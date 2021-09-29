package tut4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalc
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
    public void Testadd(){
        int a1 = 1;
        int a2 = 3;
        int result;
        result = new Calc().add(a1, a2);
        assertEquals(4, result);
    }

    @Test
    public void Testsubtract(){
        int b1=4;
        int b2=1;
        int result2;
        result2 = new Calc().subtract(b1, b2);
        assertEquals(3, result2);
    }
}