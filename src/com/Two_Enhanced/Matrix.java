package com.Two_Enhanced;

public class Matrix {
    private int rows;
    private int columns;
    int[][] elements;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setElement(int i, int j, int value) {
        elements[i][j] = value;
    }

    public Matrix add(Matrix other) {
        if (rows != other.rows || columns != other.columns) {
            System.out.println("Matrices cannot be added");
            return null;
        }
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.elements[i][j] = elements[i][j] + other.elements[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (columns != other.rows) {
            System.out.println("Matrices cannot be multiplied");
            return null;
        }
        Matrix result = new Matrix(rows, other.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                for (int k = 0; k < columns; k++) {
                    result.elements[i][j] += elements[i][k] * other.elements[k][j];
                }
            }
        }
        return result;
    }
}
