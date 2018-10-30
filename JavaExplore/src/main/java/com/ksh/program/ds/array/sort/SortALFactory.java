package com.ksh.program.ds.array.sort;

public interface SortALFactory {

	/**
	 * <b>Bubble Sort : </b> also called Sinking Sort, is a simple sorting algorithm
	 * that repeatedly steps through the list
	 * 
	 * @param ipArray
	 * @return
	 */
	int[] bubbleSort(int[] ipArray);

	/**
	 * To display the given array
	 * 
	 * @param array
	 */
	void displayArray(int[] array);

}
