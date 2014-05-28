package com.paniclater.puzzles;

import com.paniclater.puzzles.prime.PrimeFinder;

public class App {

	public static void main(String[] args) {
		PrimeFinder pf = new PrimeFinder();
		System.out.println(pf.isPrime(13));
		System.out.println(pf.isPrime(3));
		System.out.println(pf.isPrime(24));
	}

}
