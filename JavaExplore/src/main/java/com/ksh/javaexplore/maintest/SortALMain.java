package com.ksh.javaexplore.maintest;

import com.ksh.program.ds.array.sort.KSHSortALFactory;
import com.ksh.program.ds.array.sort.SortALFactory;

public class SortALMain {
	public static void main(String[] args) {
		SortALFactory sortAl = new KSHSortALFactory();
		
		int[] array = {34, 12, 8, 89, 07};
		
		System.out.println("The initial array ");
		sortAl.displayArray(array);
		System.out.println("\nis ");
		sortAl.displayArray(sortAl.bubbleSort(array));
	}
}
