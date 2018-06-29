package com.ksh.javaexplore.maintest;

import com.ksh.program.array.matrix.KSHMatrixFactory;
import com.ksh.program.array.matrix.MatrixFactory;

public class MatrixMain {
	public static void main(String[] args) {
		MatrixFactory matrix = new KSHMatrixFactory();
		int[][] matrix1 = {{7, 2}, {5, 3}};
		int[][] matrix2 = {{2, 1}, {2, 1}};
		int[][] addtionMatrix = matrix.add(matrix1, matrix2);
		
		System.out.println("The sume of \n"+matrix.dispalyMatrixStr(matrix1)+"and \n"+matrix.dispalyMatrixStr(matrix2)+"is \n"+matrix.dispalyMatrixStr(addtionMatrix));
	}
}
