package com.ksh.j8.lambda;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;

/**
 * Function
 * DoubleFunction, DoubleToLongFunction, DoubleToIntFunction
 * LongFunction, LongToIntFunction, LongToDoubleFunction
 * IntFunction, IntToLongFuncation, IntToDoubleFunction
 * BiFunction
 * 
 * @author Kanta Kishore
 */
public class FunctionExplore {
	
	/**
	 * DoubleFunction
	 * 	R apply(double value);
	 * DoubleToLongFunction
	 *  long applyAsLong(double value);
	 * DoubleToIntFunction
	 * 	int applyAsInt(double value);
	 */
	public static void doubleFunction(){
		System.out.println("**** DoubleFunction ****");
		DoubleFunction<String> doubFun = (d) -> {
			return "Input value is "+d;
		};
		
		System.out.println(doubFun.apply(1000.0));
		
		System.out.println("**** DoubleToLongFunction ****");
		DoubleToLongFunction douTLong = (d) -> (int)d;
		System.out.println(douTLong.applyAsLong(1234.567));
		System.out.println(douTLong.applyAsLong(Double.MAX_VALUE) );
	
		System.out.println("**** DoubleToIntFunction ****");
		DoubleToIntFunction douInt = (d) -> (int)d;
		System.out.println(douInt.applyAsInt(1235.056));
		System.out.println(douInt.applyAsInt(Double.MAX_VALUE));
	}
	
	/**
	 * LongFuntion : an Operation that takes a single argument of Long and return R.
	 * 	R apply(long value);
	 * LongToIntFunction : an operation 
	 * 	int applyAsInt(long value);
	 * LongToDoubleFunction :
	 * 	double applyAsDouble(long value);
	 */
	public static void longFunction() {
		System.out.println("**** LongFunction ****");
		LongFunction<Boolean> longFunction = (a) -> a>0;
		System.out.println(longFunction.apply(1000));
		System.out.println(longFunction.apply(-1000));
		
		System.out.println("**** LongToIntFunction ****");
		LongToIntFunction longToIntFun = (a) -> (int)a;
		System.out.println(longToIntFun.applyAsInt(1002843));
		
		System.out.println("**** LongToDoubleFunction ****");
		LongToDoubleFunction longToDouFun = (a) -> (double)a;
		System.out.println(longToDouFun.applyAsDouble(10043));
	}
	
	/**
	 * Function : Takes single arguments as T and returns as R.
	 * R apply(T t); 
	 */
	public static void function(){
		System.out.println("**** Function ****");
		Function<Integer, String> function = (t)->{
			if(t%2 == 0) {
				return t+" is an even number";
			}else {
				return t+" is an Odd number";
			}
		};
		System.out.println(function.apply(5));
		System.out.println(function.apply(10));
	}
	
	public static void main(String[] args) {
		function();
		longFunction();
		doubleFunction();
	}
}
