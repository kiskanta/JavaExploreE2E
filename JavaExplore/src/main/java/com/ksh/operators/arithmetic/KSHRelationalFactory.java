package com.ksh.operators.arithmetic;

public class KSHRelationalFactory extends AbstractRelationalFactory{
	/**
	 * Re-implemented using Ternary operator. 
	 */
	@Override
	public boolean isEvenNumber(long number) {
		return (number%2==0 ? true : false);
	}
}
