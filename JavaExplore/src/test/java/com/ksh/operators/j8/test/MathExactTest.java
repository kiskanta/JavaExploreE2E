package com.ksh.operators.j8.test;

import org.junit.Test;

import com.ksh.j8.exact.MathExact;

public class MathExactTest {
	
	@Test(expected=ArithmeticException.class)
	public void integerOverFlow(){
		MathExact me = new MathExact();
		me.overflow2(2000000000, 1000000000);
	}
}
