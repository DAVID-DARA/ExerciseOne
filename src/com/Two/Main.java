package com.Two;

public class Main
{
    public static void main(String[] args)
    {
        int x = 0;
        int y = 2;
        Matrix matrix1 = new Matrix(3, 3);
        matrix1.getNumberRows();
        matrix1.getNumberColumns();


        Matrix matrix2 = new Matrix(3, 3);
        matrix1.getNumberRows();
        matrix1.getNumberColumns();


        for (int i = 0; i < matrix1.getNumberRows(); i++)
        {
            for (int j= 0; j < matrix1.getNumberColumns(); j++)
            {
                x ++;
                matrix1.setElements(i, j, x);
            }
        }

        for (int i = 0; i < matrix1.getNumberRows(); i++)
        {
            for (int j= 0; j < matrix1.getNumberColumns(); j++)
            {
                matrix1.getElements(i, j);
            }
            System.out.println("");
        }

        for (int i = 0; i < matrix2.getNumberRows(); i++)
        {
            for (int j= 0; j < matrix2.getNumberColumns(); j++)
            {
                y ++;
                matrix2.setElements(i, j, x);
            }
        }

        System.out.println("\n");

        matrix1.addMatrix();

    }
}
