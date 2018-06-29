package com.ksh.operators.arithmetic;

/**
 * To assign values to the left operand. 
 * @author Kishore Kanta
 */
public interface AssignmentOperatorFactory {
	/**
	 * To add the right and left operator and then assigning the result to the left operator. 
	 * @param exesting left variable by some value
	 * @param assignValue assign other value
	 * @return addition
	 */
	int add(int exesting, int assignValue);
	
	/**
	 * To add the right and left operator and then assigning the result to the left operator.(String concatenation) 
	 * @param exesting left variable by some value
	 * @param assignValue assign other value
	 * @return addition/concatenation.
	 */
	String add(String exesting, String assignValue);
	
	// construct code for subtraction, multiplication, divide, raising power, module(use long.) 
	// String will come for only add. 
}
