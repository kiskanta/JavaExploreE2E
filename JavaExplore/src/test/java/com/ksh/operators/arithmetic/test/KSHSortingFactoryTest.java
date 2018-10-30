package com.ksh.operators.arithmetic.test;

import org.junit.Assert;
import org.junit.Test;

import com.ksh.program.ds.array.sort.KSHSortALFactory;
import com.ksh.program.ds.array.sort.SortALFactory;

public class KSHSortingFactoryTest {
	SortALFactory sortFatory = new KSHSortALFactory();
	
	@Test
	public void bubbleSort(){
		int[] ipArray = {55, 99, 43, 3, 4,19, 34};
		int[] bubbleSort = sortFatory.bubbleSort(ipArray);
		
		int[] expectedBubbleSort = {3, 4, 19, 34, 43, 55, 99};
		Assert.assertArrayEquals(expectedBubbleSort, bubbleSort);
	}
}
