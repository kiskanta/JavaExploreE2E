package com.ksh.operators.arithmetic;

public abstract class AbstractSchoolProblems implements SchoolProblems{
	@Override
	public double areaOfCircle(int r) {
		double PI = Math.PI;
		if(r>0) { 		
			return PI * Math.pow(r, 2);
		}else {
			return 0;
		}
	}
	
	@Override
	public long power(int a, int b) {
		return 0;
	}
}
