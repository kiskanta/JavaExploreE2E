package com.ksh.javaexplore.maintest;

import com.ksh.operators.arithmetic.ArithmeticFactory;
import com.ksh.operators.arithmetic.KSHArithmeticFactory;

public class ArithmeticMain {
	public static void main(String arg[]) {
		ArithmeticFactory arithmetic = new KSHArithmeticFactory();
		
		System.out.println("The sum of 10, 11 is "+arithmetic.add(10, 11));
		
		System.out.println("The subtraction of 10, 11 is "+arithmetic.subtraction(10, 11));
		
		System.out.println("The multiplication  of 10, 11 is "+arithmetic.multiplication(10, 11));
		
		System.out.println("The modulu of  20, 10 is "+arithmetic.module(20, 10));
	}
}