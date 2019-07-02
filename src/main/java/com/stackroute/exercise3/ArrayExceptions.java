package com.stackroute.exercise3;
//Program to raise different type of exceptions explicitly
public class ArrayExceptions {
    public String raiseNegativeArraySizeException(String input)
    {
        try{
            throw new NegativeArraySizeException(input);
        }
        catch(NegativeArraySizeException e)
        {
            return e.getMessage();
        }
    }
    public String raiseIndexOutOfBoundException(String input)
    {
        try{
            throw new IndexOutOfBoundsException(input);
        }
        catch(IndexOutOfBoundsException e)
        {
            return e.getMessage();
        }
    }
    public String raiseNullPointerException(String input)
    {
        try{
            throw new NullPointerException(input);
        }
        catch(NullPointerException e)
        {
            return e.getMessage();
        }
    }
}
