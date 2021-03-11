/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alex
 */
public class ArrayMathProblemTest {
    
    public ArrayMathProblemTest() {
    }

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int[] array = {12, 5, 2, 6, 18, 4, 1, 9};
        int expResult = 57;
        int result = ArrayMathProblem.getTotal(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] array = {12, 5, 2, 6, 18, 4, 1, 9};
        double expResult = 7.125;
        double result = ArrayMathProblem.getAverage(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] array = {12, 5, 2, 6, 18, 4, 1, 9};
        int expResult = 18;
        int result = ArrayMathProblem.getHighest(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] array = {12, 5, 2, 6, 18, 4, 1, 9};
        int expResult = 1;
        int result = ArrayMathProblem.getLowest(array);
        assertEquals(expResult, result);
    }
    
}
