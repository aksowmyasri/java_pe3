package com.stackroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayExceptionsTest {
    ArrayExceptions exceptions;
    @Before
    public void setUp() throws Exception {
        exceptions =new ArrayExceptions();
    }

    @After
    public void tearDown() throws Exception {
        exceptions =null;
    }

    @Test
    public void givenInputMessageReturnNegativeArraySizeException() {
        String result = exceptions.raiseNegativeArraySizeException("negative array exception");
        assertEquals("negative array exception",result);
    }

    @Test
    public void givenInputMessageReturnIndexOutOfBoundException() {
        String result = exceptions.raiseIndexOutOfBoundException("array index out of bound exception");
        assertEquals("array index out of bound exception",result);
    }

    @Test
    public void givenInputMessageReturnNullPointerException() {
        String result = exceptions.raiseNullPointerException("null pointer exception");
        assertEquals("null pointer exception",result);
    }
}