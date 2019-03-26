package com.ksh.operators.arithmetic.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ksh.operators.arithmetic.KSHSchoolProblems;
import com.ksh.operators.arithmetic.SchoolProblems;

public class KSHSchoolProblemsTest {
	static SchoolProblems schProb = null; 
	@BeforeClass
	public static void init() {
		schProb = new KSHSchoolProblems();
	}
	
	@Test
	public void areaOfCircleTest(){
		double radius5 = 78.53981633974483; 
		double radius5Result = schProb.areaOfCircle(5);
		//Assert.assertEquals(radius5, radius5Result);
		
		Assert.assertTrue(radius5 == radius5Result);
		
		double radiusNeg5 =  schProb.areaOfCircle(-5);
		Assert.assertTrue(0 == radiusNeg5);
	}
}
