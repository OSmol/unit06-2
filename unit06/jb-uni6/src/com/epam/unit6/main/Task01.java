package com.epam.unit6.main;

public class Task01 {
	public static void main (String[] args) {
		int matrix[][] = new int [6][6];
		for (int i=0; i < matrix.length; i++) {
			for (int j=0; j < matrix.length; j++) {
				matrix[i][j]= 1;
				
				if(i==0 || i==(matrix.length-1)) {
					 matrix[i][j]=0;
				}
				if(j==0 || j==(matrix.length-1)) {
					 matrix[i][j]=0;
				}
				System.out.printf ("%3d ", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
