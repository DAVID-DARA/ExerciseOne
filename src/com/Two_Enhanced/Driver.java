package com.Two_Enhanced;

public class Driver {
    public static void main(String[] args) {
        Matrix a = new Matrix(2, 3);
        a.setElement(0, 0, 1);
        a.setElement(0, 1, 2);
        a.setElement(0, 2, 3);
        a.setElement(1, 0, 4);
        a.setElement(1, 1, 5);
        a.setElement(1, 2, 6);

        Matrix b = new Matrix(2, 3);
        b.setElement(0, 0, 6);
        b.setElement(0, 1, 5);
        b.setElement(0, 2, 4);
        b.setElement(1, 0, 3);
        b.setElement(1, 1, 2);
        b.setElement(1, 2, 1);

        Matrix c = a.add(b);
        if (c != null) {
            for (int i = 0; i < c.getRows(); i++) {
                for (int j = 0; j < c.getColumns(); j++) {
                    System.out.print(c.elements[i][j] + " ");
                }
                System.out.println();
            }
        }

        Matrix d = a.multiply(b);
    }
}