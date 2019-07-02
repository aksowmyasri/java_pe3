package com.stackroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatricesTest {

    AdditionOfMatrices matrix;
    @Before
    public void setUp() {
        matrix = new AdditionOfMatrices();
    }

    @After
    public void tearDown()
    {
        matrix = null;
    }

    @Test
    public void givenInputTwoMatricesReturnCorrectOutputMatrix()
    {
        int arr[][]=matrix.addTwoMatrices(3,2,new int[][] {{1,2},{3,4},{5,6}},new int[][] {{9,8},{7,6},{5,4}});
        assertArrayEquals(new int[][]{{10,10},{10,10},{10,10}},arr);

    }
    @Test
    public void givenInputTwoMatricesWithNegativeNumbersReturnMatrix()
    {
        int arr[][]=matrix.addTwoMatrices(3,2,new int[][] {{1,-2},{-1,4},{0,6}},new int[][] {{-2,8},{7,-9},{8,4}});
        assertArrayEquals(new int[][]{{-1,6},{6,-5},{8,10}},arr);

    }

}