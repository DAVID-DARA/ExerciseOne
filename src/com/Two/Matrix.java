package com.Two;

public class Matrix {
    private int numberRows;
    private int numberColumns;
    private int elements[][];

    public Matrix(int numberRows, int numberColumns) {
        this.numberRows = numberRows;
        this.numberColumns = numberColumns;
        this.elements = new int[numberRows][numberColumns];
    }

    public int getNumberRows() {
        return numberRows;
    }

    public int getNumberColumns() {
        return numberColumns;
    }

    public void getElements(int i, int j) {
        int value = elements[i][j];
        System.out.println(value);
    }

    public void setElements(int i, int j, int value) {
        elements[i][j] = value;
    }

    public void addMatrix() {
        int x;

        Matrix Add = new Matrix(numberRows, numberColumns);
        if ((numberRows < numberColumns) || (numberColumns < numberRows)) {
            System.out.println("Matrices cannot be added");
        }
        for (int i = 0; i<= this.numberRows; i++)
            for (int j = 0; j<=this.numberColumns; j++)
            {
                Add.elements[i][j] = elements[i][j] + Add.elements[i][j];
            }
    }
}