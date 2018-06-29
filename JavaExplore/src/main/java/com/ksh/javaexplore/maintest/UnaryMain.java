package com.ksh.javaexplore.maintest;

import com.ksh.operators.arithmetic.KSHUnaryOperatorFactory;
import com.ksh.operators.arithmetic.UnaryOperatorFactory;

public class UnaryMain {
	public static void main(String[] args) {
		UnaryOperatorFactory unaryOperator = new KSHUnaryOperatorFactory();
		
		System.out.println("The pre increment of ++5 is "+unaryOperator.preIncrement(5));
		System.out.println("The post increment of 5++ is "+unaryOperator.postIncrement(5));
	}
}
