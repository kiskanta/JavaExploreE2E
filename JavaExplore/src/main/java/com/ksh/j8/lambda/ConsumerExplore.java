package com.ksh.j8.lambda;

import java.util.function.Consumer;

/**
 * Consumer<T> : represents an operation that takes single argument T and
 * returns no result. 
 * 	void accept(T t); 
 * 	default Consumer<T> andThen(Consumer<?super T> after) 
 * andThen() : will combines the current function instance with
 * another one and returns a combined function instance which applies the two
 * function in sequence with the function passed as parameter to andThen().
 * BiConsumer IntConsumer, DoubleConsumer, LongConsumer ObjectDoubleConsumer,
 * ObjectIntConsumer, ObjectLongConsumer
 * 
 * @author Kanta Kishore
 */
public class ConsumerExplore {
	public static void consumerExp() {
		Consumer<String> consumerStr = s -> {
			System.out.println(s+" World");
		};

		Consumer<String> consumerStr2 = s -> {
			System.out.println(s+" Java");
		};
		
		consumerStr.andThen(consumerStr2).accept("Hello");
	}

	public static void main(String[] args) {
		consumerExp();
	}
}
