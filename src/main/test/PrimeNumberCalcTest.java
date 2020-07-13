import org.junit.*;

import static org.junit.Assert.assertEquals;


public class PrimeNumberCalcTest {

    private static PrimeNumberCalc instance = new PrimeNumberCalc();

    @Before
    public void setUp() throws Exception {
        System.out.println("test is begining.");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("test is end.");
    }

    @Test
    public void testSumOfPrimeNum1() {
        assertEquals(-1,instance.sumOfPrimeNum1(1));
        assertEquals(2,instance.sumOfPrimeNum1(2));
        assertEquals(5,instance.sumOfPrimeNum1(3));
        assertEquals(17,instance.sumOfPrimeNum1(10));
    }

    @Test
    public void testSumOfPrimeNum2() {
        assertEquals(-1,instance.sumOfPrimeNum1(1));
        assertEquals(2,instance.sumOfPrimeNum1(2));
        assertEquals(5,instance.sumOfPrimeNum1(3));
        assertEquals(17,instance.sumOfPrimeNum1(10));
    }



}