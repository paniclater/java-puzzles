package com.paniclater.puzzles;

import com.paniclater.puzzles.prime.PrimeSieve;

public class App {

	public static void main(String[] args) {
		PrimeSieve ps = new PrimeSieve(15485863);
		System.out.println(ps.getPrimes());
		
	}

}
