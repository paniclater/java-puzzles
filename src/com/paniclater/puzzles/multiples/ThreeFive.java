package com.paniclater.puzzles.multiples;

public class ThreeFive {
//find the sum of all multiples of 3 or 5 below 1000
	
	public void sum() {
		int sum = 0;
		for(int i = 0; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 ==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
