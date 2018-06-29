package com.ksh.program.array;

public abstract class AbstractArrayFactory implements ArrayFactory {
	@Override
	public int lengthArray(int[] array) {
		return array.length;
	}
}
