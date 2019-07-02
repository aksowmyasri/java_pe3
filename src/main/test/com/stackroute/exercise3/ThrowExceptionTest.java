package com.stackroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThrowExceptionTest {
    ThrowExceptionClass exception;
    @Before
    public void setUp() throws Exception {
        exception =new ThrowExceptionClass();
    }

    @After
    public void tearDown() throws Exception {
        exception = null;
    }

    @Test
    public void givenInputMessageReturnExceptionRaisedAndPrintFinally() {
        String result = exception.checkForException("exception raised");
        assertEquals("exception raised\treached finally",result);
    }
}