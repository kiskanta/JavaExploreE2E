package com.ksh.program.array.matrix;

public abstract class AbstractMatrixFactory implements MatrixFactory{
	
	@Override
	public void dispalyMatrix(int[][] matrix) {
		
		
	}
	
	@Override
	public String dispalyMatrixStr(int[][] matrix) {
		String matrixStr = "";
		for(int i=0; i < matrix.length; i++) {
			for(int j=0; j < matrix[i].length; j++) {
				matrixStr += matrix[i][j]+" ";
			}
			matrixStr +="\n";
		}
		return matrixStr;
	}
}
