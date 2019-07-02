package com.stackroute.exercise3;

import javax.swing.*;
import java.util.Arrays;
//Program to check Consecutive Numbers
public class NumberSeries
{
    String result="";
    public String checkConsecutiveNumbers(int[] number)
    {   int flag=0;
        int length =number.length;
        Arrays.sort(number);
        for(int i=0;i<length-1;i++){
            if(number[i]+1== number[i+1]) {
                flag = 1;
            }
            else
                flag=0;
        }
        if(flag==1)
            result="consecutive numbers";
        else
            result="not consecutive";
        return result;

    }

}
