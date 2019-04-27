package br.com.gilmario;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by gilmario on 17/02/17.
 */
public class TestAssertions {
    @Test
    public void testAssertions(){
        //test data
        String str1 = new String("abc");
        String str2 = new String("abc");

        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";

        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};

        //check that two objects are equals
        assertEquals(str1, str2);

        //Check that a condition is true;
        assertTrue(val1 < val2);

        //check that a condition is false
        assertFalse(val1 > val2);

        //Check that an object is null
        assertNull(str3);

        //check if two objects references point to the same object;
        assertSame(str4, str5);

        //check if two objects references point to the same object;
        assertNotSame(str1, str3);

        //Check whether two arrays are equal to each other.
        assertArrayEquals(expectedArray, resultArray);


    }
}