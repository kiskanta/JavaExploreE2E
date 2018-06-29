package com.ksh.operators.arithmetic.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ksh.operators.arithmetic.KSHUnaryOperatorFactory;
import com.ksh.operators.arithmetic.UnaryOperatorFactory;

public class KSHUnaryOperatorTest {
	public static UnaryOperatorFactory unaryOperator = null;
	
	@BeforeClass
	public static void init() {
		unaryOperator = new KSHUnaryOperatorFactory();
	}
	
	@Test
	public void preIncrementTest(){
		int result = unaryOperator.preIncrement(5);
		
		Assert.assertEquals(6, result);
	}
	
	@Test
	public void postIncrementTest(){
		int result = unaryOperator.postIncrement(5);
		
		Assert.assertNotEquals(6, result);
	}
}
