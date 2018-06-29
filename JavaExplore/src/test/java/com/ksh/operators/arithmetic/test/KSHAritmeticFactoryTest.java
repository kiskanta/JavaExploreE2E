package com.ksh.operators.arithmetic.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ksh.operators.arithmetic.ArithmeticFactory;
import com.ksh.operators.arithmetic.KSHArithmeticFactory;

public class KSHAritmeticFactoryTest {
	private static ArithmeticFactory arithmeticFactory;

	@Before
	public void init() {
		arithmeticFactory = new KSHArithmeticFactory();
	}

	@Test
	public void addtionTest() {
		Assert.assertTrue(21 == arithmeticFactory.add(10, 11));
	}

	@Test
	public void substractionTest() {
		Assert.assertEquals(-1, arithmeticFactory.subtraction(10, 11));
	}

	@Test
	public void multiplicationTest() {
		Assert.assertNotEquals(111, arithmeticFactory.multiplication(10, 11));
	}
}
