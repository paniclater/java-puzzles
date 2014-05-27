package com.paniclater.puzzles.fizzbuzz;

public class FizzBuzz {
	public FizzBuzz() {
		System.out.println("FIIIIIZZBUZZZZZZING!");
	}
	public void go() {
		for (int i = 1; i < 100; i++) {
			if((i % 3 == 0 ) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");

			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
