package com.ksh.operators.arithmetic;

public class KSHUnaryOperatorFactory extends AbstractUnaryOperatorFactory{

	@Override
	public int preIncrement(int i) {
		return ++i;
	}
	
	@Override
	public int postIncrement(int i){
		return i++;
	}
}
