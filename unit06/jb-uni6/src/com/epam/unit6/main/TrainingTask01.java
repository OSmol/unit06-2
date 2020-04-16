package com.epam.unit6.main;

public class TrainingTask01 {
	public static void main (String[] args) {
		int matrix[][] = new int [5][5];
		int x = 0;
		int y = 1;
		for (int i=0; i < matrix.length; i++) {
			for (int j=0; j < matrix[i].length; j++) {
				matrix[i][j]=x+y;
				x=y;
				y=matrix[i][j];
				System.out.printf ("%8d ", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
