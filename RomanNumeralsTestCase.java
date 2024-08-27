/**
 * Summary
 * Implement a solution to convert a roman numeral into a numeric (decimal) value.
 *
 * Symbols
 * Symbol	Numeric Value
 * I	    1
 * V	    5
 * X	    10
 * L	    50
 * C	    100
 * D	    500
 * M	    1000
 *
 * These rules can be used to convert a roman numeral to a decimal number Roman Numerals
 * * Repeated symbols mean addition
 * * V,L and D symbols are never repeated
 * * Given two consecutive symbols, if the value of the left symbol is >= value of the right symbol - add the values (e.g., VI = 5 + 1 = 6)
 * * Given two consecutive symbols, if the value of the left symbol is < value of the right symbol - add the result of subtracting the left value from the right value (e.g., IV = 5 - 1 = 4)
 * * Symbols can’t be repeated more than 3 times (e.g., III = 3 GOOD, IIII = Invalid BAD)
 *
 * Examples
 * Roman Numeral	Numeric Value
 * I	            1
 * V	            5
 * IV	            4
 * VI	            6
 *
 * Completion Instructions
 * Your responsibility is to create an implementation that takes in a string representing a roman numeral and
 * return back the equivalent numeric (decimal) equivalent. Running the tests frequently are encouraged.
 * In fact, we highly recommend that you start by running the tests to review the generated output when failures occur.
 * A big portion of the evaluation is based on your ability to create an implementation that allows as many of the
 * tests to succeed.
*/

import org.junit.*;
import org.junit.Test;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class RomanNumeralsTestCase {

    /*
     Entry Point
    */
    public static void main(String[] args) {
        JUnitCore.main("RomanNumerals");
    }


    public interface Roman {
        Integer roman(String input);
    }

    // YOUR CODE BELOW THIS POINT vvv

    static class RomanImpl implements Roman {
        public Integer roman(String input) {
            // YOUR IMPLEMENTATION
            throw new UnsupportedOperationException();
        }
    }

    // YOUR CODE ABOVE THIS POINT ^^^

    // TESTS BELOW
    Roman roman;

    @Before
    public void setup() {
        roman = new RomanImpl();
    }


    @Test
    public void test_1() {
        Assert.assertEquals(1, roman.roman("I").intValue());
        Assert.assertEquals(1, roman.roman("i").intValue());
    }

    @Test
    public void test_5() {
        assertEquals(5, roman.roman("V").intValue());
        assertEquals(5, roman.roman("v").intValue());
    }

    @Test
    public void test_4() {
        assertEquals(4, roman.roman("IV").intValue());
    }

    @Test
    public void test_6() {
        assertEquals(6, roman.roman("VI").intValue());
    }

    @Test
    public void test_199() {
        assertEquals(199, roman.roman("CXCIX").intValue());
    }

    @Test
    public void test_null() {
        assertNull(roman.roman(null));
    }

    @Test
    public void test_25() {
        assertEquals(25, roman.roman("XXV").intValue());
    }

    @Test
    public void test_512() {
        assertEquals(512, roman.roman("DXII").intValue());
    }

    @Test
    public void test_1898() { // CME Founded
        assertEquals(1898, roman.roman("MDCCCXCVIII").intValue());
    }

    @Test
    public void test_2023() {
        assertEquals(2023, roman.roman("MMXXIII").intValue());
    }
}
