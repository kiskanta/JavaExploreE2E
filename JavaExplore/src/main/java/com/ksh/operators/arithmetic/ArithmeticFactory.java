package com.ksh.operators.arithmetic;

public interface ArithmeticFactory {
	/**
	 * Addition of given numbers i and j
	 * 
	 * @param i
	 *            first integer number
	 * @param j
	 *            second integer number
	 * @return sum of i and j
	 */
	int add(int i, int j);

	/**
	 * Subtraction of given numbers i and j
	 * 
	 * @param i
	 *            first integer number
	 * @param j
	 *            second integer number
	 * @return subtraction of i and j
	 */
	int subtraction(int i, int j);

	/**
	 * Multiplication of given numbers i and j
	 * 
	 * @param i
	 *            first integer number
	 * @param j
	 *            second integer number
	 * @return multiplication of i and j
	 */
	int multiplication(int i, int j);

	/**
	 * Modulus - divides left-hand operand by right-hand operand and returns
	 * remainder.
	 * 
	 * @param i
	 *            left hand value
	 * @param j
	 *            right hand value
	 * @return result of remainder
	 */
	int module(int i, int j);

}
