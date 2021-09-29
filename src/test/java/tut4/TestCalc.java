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
}