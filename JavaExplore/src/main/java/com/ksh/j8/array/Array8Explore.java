package com.ksh.j8.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.IntConsumer;

public class Array8Explore {
	public static void main(String[] args) {
		//sort();
		forEachSplit();
	}
	/**
	 * https://stackoverflow.com/questions/51453841/difference-between-iterator-and-spliterator-in-java8
	 */
	public void split() {
		int[] ints = new int[10];
		Arrays.fill(ints, 10);
		
		Spliterator.OfInt spliter = Arrays.spliterator(ints);
		spliter.forEachRemaining((IntConsumer)System.out::println);
		
		// Spliterator
		//tryAdvance() - we can traverse underlying elements one by one, if a remaining element exists, this method performs the consumer action on it. returning true or flase.  
		List<String> list = Arrays.asList("Apple", "Banana", "Orange");
		
		
		
		// forEachRemaing	- 
	}
	
	public static void forEachSplit(){

		List<String> strLis = new ArrayList<>();
		for(String str : strLis) {
			System.out.println(str);
		}
	}
	/**
	 * sort provided using Fork and Join framework, processing sorting algorithm in parallel.
	 */
	public static void sort() {
		System.out.println("*** SORT ***");
		int[] intArray = {3, 1, 24, 5, 4, 61, 59, 7,15, 2, 12, 25};
		Arrays.parallelSort(intArray);
		System.out.println(Arrays.toString(intArray));
		
	}
}
