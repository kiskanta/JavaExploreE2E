package com.ksh.program.ds.array.sort;

/**
 * <b>Sorting : </b>
 * 
 * <b>Sorting Algorithm : </b> Selection Sort, Bubble Sort, Insertion Sort,
 * Recursion Insertion Sort, Merge Sort, Iterative Merge Sort, Heap Sort,
 * Counting Sort, ....
 * 
 * @author KisKanta
 */
public interface SortALFactory {

	/**
	 * Selection Sort Algorithm Sorts an Array by repeatedly finding the minimum
	 * element (Ascending order) from unsorted part and putting it at begging.
	 * 
	 * @param inArray Given int array for sort
	 * @return Sorted Array
	 */
	int[] selectionSort(int[] inArray);

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
