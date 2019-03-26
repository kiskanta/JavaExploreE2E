package com.ksh.j8.exact;

import java.math.BigInteger;

/**
 * Java arithmetic operations will silently cause numeric overflow if the result
 * is bigger than the target data type capacity. <br/>
 * Java 8 introduce various methods in java.lang.Math class which will throw
 * ArithmeticException instead of silently allowing numeric overflow.<br/>
 * xxxx xxxExact(..)
 * int addExact(int x, int y)
long addExact(long x, long y)
int subtractExact(int x, int y)
long subtractExact(long x, long y)
int multiplyExact(int x, int y)
long multiplyExact(long x, long y)
int incrementExact(int a)
long incrementExact(long a)
int decrementExact(int a)
long decrementExact(long a)
int negateExact(int a)
long negateExact(long a)
int toIntExact(long value)
 * 
 * @author Kanta Kishore
 *
 */
public class MathExact {

	public void overflow2(int i, int j) {

		int out = Math.addExact(i, j);
		System.out.println(out);
	}

	public static String add(int i, int j) {
		String str = null;
		try {
			int out = Math.addExact(i, j);
			str = String.valueOf(out);
			System.out.println("The value is " + str);
		} catch (Exception e) {
			BigInteger bi1 = BigInteger.valueOf(i);
			BigInteger bi2 = BigInteger.valueOf(j);

			BigInteger k = bi1.add(bi2);
			str = k.toString();
			System.out.println("Value at exception " + str);
		}
		return str;
	}

	public void overflow1(int i, int j) {
		int out = i + j;
		System.out.println(out);
	}
}
