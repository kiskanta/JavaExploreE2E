package com.ksh.program.ds.array.sort;

public class KSHSortALFactory extends AbstractSortALFactory {

	@Override
	public int[] bubbleSort(int[] ipArray) {
		int outer, inner, index = ipArray.length;

		for (outer = index - 1; outer > 0; outer--) { // outer loop (in back word direction)
			for (inner = 0; inner < outer; inner++) { // inner loop (in forward direction)
				if (ipArray[inner] > ipArray[inner + 1]) { // out of order
					swap(ipArray, inner, inner + 1); // swaping
				}
			}
		}
		return ipArray;
	}

}
