package com.java.androidcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {

    @Test
    public void Given_NumberInsertedInto_sqrtEvent() {
        final String givenInt = "25";

        final String expectedResult = "5.0";
        final String actualResult = ForTestingClass.sqrtEvent(givenInt);

        assertEquals(expectedResult, actualResult);
    }
}