package com.paniclater.puzzles.prime;


public class PrimeFinder {
	private int divisorsCount;
	
	public PrimeFinder() {
		System.out.println("I'm primed.");
	}
	public boolean isPrime(int prime) {
		for(int i = prime; i > 0; i--) {
			if(prime % i == 0) {
				divisorsCount++;
			};
		}
		if(divisorsCount > 2) {
			return false;
		}
		return true;
	}
}
