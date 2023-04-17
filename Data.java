package ex124;

import java.util.Arrays;

public class Data {
	double[][] data;
	
	public Data(int rows, int cols) {
		this.data = new double[rows][cols];
	}
	
	public void setCell(int row, int col, double value) {
		this.data[row][col] = value;
	}
	
	public double saviv(int row, int col) {
		double sum=0;
		if (row != 0)
			sum+= data[row-1][col];
		if (col != data[row].length-1)
			sum += data[row][col+1];
		if (row != data.length-1)
			sum+= data[row+1][col];
		if (col != 0)
			sum+= data[row][col-1];
		
		return sum;
	}
	
	public double diag(int row, int col) {
		double sum=saviv(row,col);
		if (row != 0 && col !=0)
			sum+= data[row-1][col-1];
		if (row !=0 && col != data[row].length-1)
			sum += data[row-1][col+1];
		if (row != data.length-1 && col != data[row].length-1 )
			sum+= data[row+1][col+1];
		if (row != data.length-1 && col != 0)
			sum+= data[row+1][col-1];
		
		return sum;
	}
	
	public String toString() {
		String result="";
		for (int i =0; i< data.length;i++) {
			for (int j =0; j< data[i].length;j++)
				result += data[i][j] + "\t";
			result += "\n";
		}
		return result;
	}
}
