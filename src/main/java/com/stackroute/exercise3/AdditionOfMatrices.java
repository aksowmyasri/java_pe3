package com.stackroute.exercise3;
//Program for addtition of two matrices
public class AdditionOfMatrices
{
    public static int[][] addTwoMatrices(int rows,int columns,int[][] first_matrix,int[][] second_matrix)
    {
        int add[][]= new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                add[i][j]=first_matrix[i][j]+second_matrix[i][j];
            }
        }
        return add;
    }

}
