package com.stackroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSeriesTest {
    NumberSeries series;
    @Before
    public void setUp() throws Exception {
        series = new NumberSeries();
    }

    @After
    public void tearDown() throws Exception {
        series = null;
    }

    @Test
    public void givenInputAsForwardConsecutiveNumbersReturnConsecutiveNumbers() {
        String result = series.checkConsecutiveNumbers(new int[] {1,2,3,4,5,6});
        assertEquals("consecutive numbers",result);

    }
    @Test
    public void givenInputAsBackwardConsecutiveNumbersReturnConsecutiveNumbers() {
        String result = series.checkConsecutiveNumbers(new int[] {6,5,4,3,2,1});
        assertEquals("consecutive numbers",result);

    }
    @Test
    public void givenInputNumbersReturnNotConsecutiveNumbers() {
        String result = series.checkConsecutiveNumbers(new int[] {1,5,6,3,21});
        assertEquals("not consecutive",result);

    }
}