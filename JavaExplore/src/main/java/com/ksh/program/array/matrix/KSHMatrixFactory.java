package com.ksh.program.array.matrix;

public class KSHMatrixFactory extends AbstractMatrixFactory{

	@Override
	public int[][] add(int[][] matrix1, int[][] matrix2) {
		int row = matrix1.length;
		int column = matrix2[0].length;
		
		int resultMatrix[][] = new int[row][column];
		
		for(int i=0; i< row; i++) {
			for(int j=0; j< column; j++) {
				resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return resultMatrix;
	}

	@Override
	public int[][] subtraction(int[][] matrix1, int[][] matrix2) {
		
		return null;
	}

	@Override
	public int[][] multiplication(int[][] matrix1, int[][] matrix2) {
		
		return null;
	}

	@Override
	public int[][] transpose(int[][] matrix) {
		
		return null;
	}
	
}
