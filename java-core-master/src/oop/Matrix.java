package oop;

public class Matrix {
    private double[][] array;
    private int rows;
    private int columns;

    public Matrix(double[][] array) {
        setArray(array);
    }

    public double[][] getArray() {
        return array.clone();
    }

    public void setArray(double[][] array) {
        this.array = array.clone();
        this.rows = array.length;
        this.columns = array[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}
