package com.ksh.program.array.matrix;

public interface MatrixFactory {
	int[][] add(int[] matrix1[], int[] []matrix2);
	
	int[][] subtraction(int[][] matrix1, int[][] matrix2);
	
	int[][] multiplication(int[][] matrix1, int[][] matrix2);
	
	/**
	 * 
	 * @param matrix
	 * @return
	 */
	int[][] transpose(int matrix[][]);
	
	/**
	 * TO display the matrix.
	 * @param matrix
	 */
	void dispalyMatrix(int[][] matrix);
	
	String dispalyMatrixStr(int[][] matrix);
}
