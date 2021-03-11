/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alex
 */
public class ArrayHigherNumbersTest {
    
    public ArrayHigherNumbersTest() {
    }

    @Test
    public void testFindHigherNumbersZero() {
        System.out.println("findHigherNumbers");
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(5);
        array.add(7);
        int n = 9;
        int expResult = 0;
        int result = ArrayHigherNumbers.findHigherNumbers(array, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindHigherNumbers() {
        System.out.println("findHigherNumbers");
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(5);
        array.add(7);
        int n = 1;
        int expResult = 3;
        int result = ArrayHigherNumbers.findHigherNumbers(array, n);
        assertEquals(expResult, result);
    }
}
