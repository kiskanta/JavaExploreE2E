package com.ksh.program.ds.array.sort;

public abstract class AbstractSortALFactory implements SortALFactory {
	@Override
	public void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
	
	void swap(int[] array,int pos1, int pos2){
		int temp 	= array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}
}
