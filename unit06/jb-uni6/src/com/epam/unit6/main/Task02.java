package com.epam.unit6.main;

public class Task02 {
	public static void main(String[] args) {
        int n = 6;
        int matrix[][] = new int [n][n];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j <matrix[i].length-i; j++){
            	matrix[i][j]=i+1;
            }
        	for (int i = 0 ; i < matrix.length; i++) {
        		for (int j = 0; j < matrix[i].length; j++){
        			System.out.printf ("%3d ", matrix[i][j]);
        		}
        		System.out.println();
        	}
    }
}
