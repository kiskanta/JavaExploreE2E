package com.ksh.j8.lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * UnaryOperator<T> - A special type of Function accepts and returns the same type T.
 * 	T apply(T t);
 * BinaryOperator<T> - A special type of BiFunction but accepts two arguments of same type and returns the same type as well.
 * 
 * @author Kanta Kishore
 *
 */
public class OperatorExplore {
	/**
	 * andThen() - 
	 * compose() - 
	 */
	public static void unaryOper(){
		UnaryOperator<Integer> operator = t -> t*2;
		System.out.println(operator.apply(5));
		
		UnaryOperator<Integer> operator1 = t -> t + 10;
		UnaryOperator<Integer> operator2 = t -> t * 10;
		
		//5+10 = 15 -> 15* 10 = 150. 
		int a =operator1.andThen(operator2).apply(5);
		System.out.println("andThen() "+a);
		
		int b =operator1.compose(operator2).apply(5);
		System.out.println("compose() " +b);
		
	}
	
	/**
	 * BinaryOpertor : represents an operation that takes two arguments of same type and returns a results of same type as its input type.
	 */
	public static void binaryOper(){
		BinaryOperator<Integer> operator = (a, b) -> a+b;
		Function<Integer, Integer> operatorIn = n -> n* 2;
		
		System.out.println(operator.andThen(operatorIn).apply(10, 10));
		
		System.out.println("max and min");
		
		Comparator<Integer> compInt = (a, b) -> a.compareTo(b);
		
		BinaryOperator<Integer> binOperMax = BinaryOperator.maxBy(compInt);
		System.out.println(binOperMax.apply(10, 15));
		
		BinaryOperator<Integer> binOperMin = BinaryOperator.minBy(compInt);
		System.out.println(binOperMin.apply(10, 15));
	}
	
	public static void main(String[] args) {
		unaryOper();
		binaryOper();
	}
}
