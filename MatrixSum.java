//Caden Luksic 10/10/2024 - Lab07/src/MatrixSum.java
//Lab 7: Matrix Addition

import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in); //crating a scanner object
		
		//dimensions of matrix 1
		System.out.println("Enter the number of rows for the first matrix:");
		int rows = key.nextInt();
		System.out.println("Enter the number of coloumns for the first matrix:");
		int col = key.nextInt();
		
		//create first matrix
		int[][] matrix1 = new int[rows][col];
		
		//input values for matrix 1
		System.out.println("Enter the values for the first matrix");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < col; j++) {
				matrix1[i][j] = key.nextInt();
			}
		}
		
		//dimensions of matrix 2 
		int rows2;
		int col2;
		
		//loop to validate the matrix's can be added together
		do {
			System.out.println("Enter the number of rows for second matrix:");
			rows2 = key.nextInt();
			System.out.println("Enter the number of columns for the second matrix:");
			col2 = key.nextInt();
			if(rows2 != rows || col2 != col) {
				System.out.println("Dimensions don't match. Please re-enter:");
			}
		} while (rows2 != rows || col2 != col);
		
		//create the second matrix
		int[][] matrix2 = new int [rows2][col2];
		
		//input values for matrix 2
		System.out.println("Enter the values for the second matrix");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < col; j++) {
				matrix2[i][j] = key.nextInt();
			}
		}
		
		//add the two matrix's
		int[][] matrixSum = new int [rows][col];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < col; j++) {
				matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		//printing the result
		System.out.println("Result:");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < col2; j++) {
				System.out.print(matrixSum[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
