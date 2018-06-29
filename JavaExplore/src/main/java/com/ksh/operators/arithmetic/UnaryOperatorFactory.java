package com.ksh.operators.arithmetic;

/**
 * unary means single.
 * Incremental operator(++): Used for increasing of the operand by 1. 
 * 	pre-increment
 * 	post-increment
 * Decrement operator(--): Used for Decreasing of the operand by 1.
 * 	pre-decrement
 * 	post-decrement
 * Logical not operator (!) - used for inverting a boolean value.
 * @author Kishore Kanta
 *
 */
public interface UnaryOperatorFactory {
	// 
	/**
	 * The value is incremented later then the result is computed.
	 * 
	 * @param i
	 *            The value
	 * @return pre-Increment result
	 */
	int preIncrement(int i);

	/**
	 * The value is incremented first then the result is computed
	 * 
	 * @param i
	 *            passed value
	 * @return post-increment result
	 */
	int postIncrement(int i);
	
	// complete code for decrement
	
	// complete code for logical not operator 
}
