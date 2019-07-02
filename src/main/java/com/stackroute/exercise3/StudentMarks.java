package com.stackroute.exercise3;
//Program to check Student Grades Between 0 and 100
public class StudentMarks
{
    public String checkingTheStudentGrades(int numOfStudents,int[] grades)
    {
        String result="";
        int count=0;
        for(int i=0;i<numOfStudents;i++)
        {
            if(grades[i]>=0 && grades[i]<=100)
                count++;
        }
        if(count==numOfStudents)
            result= "grades are checked with no errors";
        else
            result="grades should be between 0 and 100";
            return result;
    }

}
