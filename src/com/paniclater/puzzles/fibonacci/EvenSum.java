package com.paniclater.puzzles.fibonacci;


public class EvenSum {
//the goal is to find the sum of all even fibonacci number
//in this example the first two numbers of the sequence will be 1 and 2
	
	public void sum() {
		int sum = 2;
		int first = 1;
		int second = 2;
		int placeholder = 0;
		while(sum < 4000000) {
			placeholder = second;
			second = first + second;
			first = placeholder;
			if(second % 2 == 0) {
				sum += second;
			}
		}
		System.out.println(sum);
	}
}
