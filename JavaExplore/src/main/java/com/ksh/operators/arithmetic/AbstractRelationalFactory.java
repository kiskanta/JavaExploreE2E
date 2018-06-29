package com.ksh.operators.arithmetic;

public abstract class AbstractRelationalFactory implements RelationalFactory{
	/**
	 * Constructed using if-else condition.
	 */
	@Override
	public boolean isEvenNumber(long number) {
		if(number%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
}
