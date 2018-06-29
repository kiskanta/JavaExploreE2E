package com.ksh.operators.arithmetic;

public class KSHAssignmentOperator extends AbstractAssignmentFactory{

	@Override
	public int add(int exesting, int assignValue) {
		exesting += assignValue;
		return exesting;
	}

	@Override
	public String add(String exesting, String assignValue) {
		exesting += assignValue;
		return exesting;
	}
	
}
