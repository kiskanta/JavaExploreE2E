package com.ksh.program.array;

import java.util.Arrays;

public abstract class AbstractArrayFactory implements ArrayFactory {
	@Override
	public int lengthArray(int[] array) {
		return array.length;
	}
	
	@Override
	public int smallestNumber(int[] array) {
		int length = array.length;
		int temp;
		for(int i=0; i<length; i++) {
			for(int j=i+1; j<length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[0];
	}
	/**
	 * O(n logn) sorting.
	 */
	@Override
	public int kthSmallesNumber(int[] array, int k) {
		Arrays.sort(array);
		return array[k-1];
	}
}


