package com.epam.unit6.main;

public class Task03 {
	public static void main(String[] args) {
        int n = 6;
        int matrix[][] = new int [n][n];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j <matrix[i].length; j++){
            	matrix[i][j]=1;
            }
        	//0-3 i, 0-3 j
        	for(int i = 0; i < matrix.length/2; i++) {
        		for(int j = 0; j < matrix[i].length/2; j++) {
        			if(j < i) {
        				matrix[i][j]=0;
        			}
				}
			}
        	//0-3 i, 3-6 j
        	for(int i = 0; i < matrix.length/2; i++) {
   			 	for(int j = matrix[i].length/2; j < matrix[i].length; j++) {
   			 		if(j >= matrix.length-i) {
   			 			matrix[i][j]=0;
   			 		}
   			 	}
   		 	}
        	//3-6 i, 0-3 j
        	for(int i = matrix.length/2; i < matrix.length; i++) {
   			 	for(int j = 0; j < matrix[i].length/2; j++) {
   			 		if(j < (matrix.length-i-1)) {
   			 			matrix[i][j]=0;
   			 		}
   				}
   			}
        	//3-6 i, 3-6 j
        	for(int i = matrix.length/2; i < matrix.length; i++) {
   			 	for(int j = matrix[i].length/2; j < matrix[i].length; j++) {
   			 		if(j > i) {
   			 			matrix[i][j]=0;
   			 		}
   			 	}
   		 	}
        	//print
        	for (int i = 0 ; i < matrix.length; i++) {
        		for (int j = 0; j < matrix[i].length; j++){
        			System.out.printf ("%3d ", matrix[i][j]);
        		}
            System.out.println();
        	}
    }
}
// Молодец. Только аккуратней с { }, а то они у тебя танцы пляшут, читать неудобно
