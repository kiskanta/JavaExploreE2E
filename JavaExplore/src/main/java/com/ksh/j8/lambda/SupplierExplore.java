package com.ksh.j8.lambda;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/**
 * Funcational Interface 
 * Supplier : represents an operation that takes no argument and returns a result R.
 *  R get();
 * LongSupplier : represents an operation that takes no argument and returns a result of long type.
 * 	long getAsLong(); 
 * DoubleSupplier : represents an operation that takes no argument and returns a result of double type.
 * 	double getAsDouble(); 
 * BooleanSupplier : represents an operation that takes no argument and returns a result of boolean type.
 *  boolean getAsBoolean();
 *  
 * @author Kanta Kishore
 *
 */
public class SupplierExplore {
	
	public static void supplier(){
		Supplier<String> strSupplier = () -> {
			return "Hello Supplier";
		};
		
		Supplier<Integer> intSupplier = () -> {
			return 40;
		};
		
		System.out.println(strSupplier.get());
		System.out.println(intSupplier.get());
	}
	
	public static void longSupp(){
		LongSupplier longSupp = () ->{
			return 10;
		};
		
	}
	
	public static void booleanSupp(){
		BooleanSupplier booleanSup1 = () -> true;
		
		BooleanSupplier booleanSup2 = () -> "java".contains("java");
		
		System.out.println(booleanSup1.getAsBoolean());
		System.out.println(booleanSup2.getAsBoolean());
	}
	
	public static void doubleSupp(){
		DoubleSupplier doubleSup = () -> {
			return Math.random() * 1000;
		};
		
		DoubleSupplier doubleCal = () -> 8/7;
		
		System.out.println(doubleSup.getAsDouble());
		System.out.println(doubleCal.getAsDouble());
	}
	
	public static void main(String[] args) {
		supplier();
		booleanSupp();
		doubleSupp();
		longSupp();
	}
}
