package com.ksh.j8.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Predicate, BiPredicate, DoublePredicate, IntPredicate, LongPredicate.
 * boolean test(T t);
 * and() - It does logical AND of the predicate on which it is called with an other predicate.
 * or()	- It does logical OR of the predicate on which it is called with an other prediccate.
 * negate() - it does boolean negation of the predicate on which it is invoked.   
 * default Predicate<T> and(Predicate<? super T> other)
 * @author Kanta Kishore
 */
public class PredicateExplore {
	public static void longPredicate(){
		Predicate<String> predicate = (t) -> {
			return t.equals("hello");
		};
		System.out.println(predicate.test("hello"));
		
		System.out.println("AND, OR, NeGate");
		// AND Logic
		Predicate predAnd = predicate.and(t -> t.length() > 4);
		System.out.println(predAnd.test("hello"));
		// or Gate
		Predicate preOr = predicate.or(t -> t.length() == 10);
		System.out.println(preOr.test("hello"));
		
		// Negate 
		Predicate preNegate = predicate.negate();
		System.out.println(preNegate.test("hello"));
		
		System.out.println("Bio Predicate");
		BiPredicate<String, String> biPre = (a, b)->{return a.equals(b);};
		System.out.println(biPre.test("hello", "hello"));
		
		BiPredicate<Long, Long> loPre = (a, b) -> {return a > b;};
		BiPredicate<Long, Long> loPre2 = (a, b) -> {return a == b;};
		
		System.out.println(loPre.and(loPre2).test(10l, 10l));
		System.out.println(loPre.or(loPre2).test(10l, 10l));
		System.out.println(loPre.negate().test(8l, 9l));		
	}
	
	public static void main(String[] args) {
		longPredicate();
	}
}
