package com.techlabs.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 66, 44, 88, 22);
		// Stream<Integer> numberStream = numbers.stream();
		// numberStream.forEach((number) -> System.out.println(number));
		// numbers.stream()
		// .forEach((number) -> System.out.println(number));

		List<Integer> oddNumbers = numbers.stream()
				.filter((number) -> (number % 2 != 0))
				.filter((number) -> (number > 35))
				.collect(Collectors.toList());

		oddNumbers.forEach((number) -> System.out.println(number));

		List<Integer> squareNumbers = numbers.stream()
				.map((number) -> number * number)
				.collect(Collectors.toList());
		
		int sum= numbers.stream()
				.reduce(0, (number1,number2)-> number1+number2);
		System.out.println("sum"+sum);
		
		numbers.stream()
			.sorted()
			.forEach((number)->System.out.println(number));
		
		numbers.stream()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList())
		.forEach((number) -> System.out.println(number));
		
		numbers.stream()
			.sorted()
			.limit(3)
			.forEach((number)->System.out.println(number));
		
		Optional<Integer>max=numbers.stream().max((number1,number2)->number1-number2);
		if(max.isPresent())
			System.out.println("max is:" + max.get());
		
		Optional<Integer> min=numbers.stream().min((number1,number2)->number1-number2);
		if(min.isPresent())
			System.out.println("min is:" +min.get());
	}

}