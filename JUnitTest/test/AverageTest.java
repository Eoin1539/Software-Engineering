/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eoinkirwan
 */
public class AverageTest {
    
    public AverageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Average.
     */
    @Test
    //This test will fail as 2+6=8 and not 7
    public void testAdd() {
        System.out.println("Add");
        int a = 2;
        int b = 6;
        int expResult = 7;
        int result = Average.add(a, b);
        assertEquals(expResult, result);
        if(result !=expResult){
            throw new RuntimeException ("Test failed as result does not match expected result");
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }
@Test
//This test will fail as result = -28 but expected is 4
    public void testSubtract() {
        System.out.println("Subtract");
        int a = 9;
        int b = 1;
        int c =12;
        int d = 20;
        int e=4;
        int expResult = 4;
        int result = Average.subtract(a, b, c, d, e);
        assertEquals(expResult, result);
        if(result !=expResult){
            throw new RuntimeException ("Test failed as result does not match expected result");
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
//This test will pass as the average of 9 1 and 12 is equal to 7 which is expected result
    public void testAvg() {
        System.out.println("Average");
        int a = 9;
        int b = 1;
        int c =12;
        int d = a+b+c;
        int expResult = 7;
        int result = Average.avg(a, b, c, d);
        assertEquals(expResult, result);
        if(result !=expResult){
            throw new RuntimeException ("Test failed as result does not match expected result");
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    /**
     * 
     */
    @Test
    //This test will fail as the result was 2134.5882352941176 and expected was 4
    public void testmultiplyDivide() {
        double a=9;
        double b=24;
        double c=12;
        double d=28;
        double e=34;
        double expResult =4;
        double result = Average.multiplyDivide(a,b,c,d,e);
        assertEquals(expResult, result, 0.001);
        if (result !=expResult){
            throw new RuntimeException("Test failed as result did not match expected.");
        }
    }
    @Test
    //This test will pass as the expected result = 55 which is equal to result
    public void testfibonacci() {
        int n=10;
        int expResult =55;
        int result = Average.fibonacci(n);
        assertEquals(expResult, result);
        if (result !=expResult){
            throw new RuntimeException("Test failed as result did not match expected.");
        }
    }

    /**
     * Test of area method, of class Average.
     */
    @Test
    //This test will pass as 5*5 is 25 which is the expected result
    public void testArea() {
        Average a = new Average(5);
        double expected =25;
        double actual =a.area();
        assertEquals(expected, actual, 0.00);
    }
    
}
