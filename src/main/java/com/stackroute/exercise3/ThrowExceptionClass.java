package com.stackroute.exercise3;
//Program to raise Exception and print message with finally message
public class ThrowExceptionClass {
    public static String checkForException(String input)
    {
        String result="";
        try{
            throw new Exception(input);
        }
        catch(Exception e)
        {
            result=result+e.getMessage();
        }
        finally{
            result=result+("\treached finally");

    }
        return result;
    }
}
