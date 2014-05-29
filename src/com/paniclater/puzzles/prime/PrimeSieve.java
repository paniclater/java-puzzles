package com.paniclater.puzzles.prime;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PrimeSieve {
	//My first go at an implementation of Eratosthenes Sieve
	//It is a method of calculating primes up to a certain number by eliminating multiples from a list
	//My implementation is pretty inefficient, will try to optimize later
	
	//private List<Integer> candidates = new ArrayList<>();
	private TreeMap<Integer, Boolean> candidates = new TreeMap<>();
	private List<Integer> iterators = new ArrayList<>();
	private List<Integer> primes = new ArrayList<>();
	public PrimeSieve(int n) {
		for(int i = 2; i <= n; i++) {
			iterators.add(i);
			candidates.put(i, true);
		}
		for(int i = 2; i <= candidates.size() + 1; i++) {
			if(candidates.get(i) == true) {
				sieve(i);
			}
		}
		createPrimesFromCandidates();
	}
	
	private Map<Integer, Boolean> sieve(int key) {
		int iterator = key;
		while (key <= candidates.size()) {
			key += iterator;
			if(key > candidates.size() + 1) {
				break;
			}
			candidates.put(key, false);	
		}

		return candidates;
	}
	
	private void createPrimesFromCandidates() {
		for(Map.Entry<Integer, Boolean> entry : candidates.entrySet()) {
			if(entry.getValue() == true) {
				primes.add(entry.getKey());
			}
		}
	}
	public List<Integer> getPrimes() {
		return primes;
	}
	//make a list of numbers starting at 2 and ending at the final number
	//take the first number of the list and cross off every second number
	//take the next uncrossed number on the list and cross off every 3rd number
	//repeat, each time cross off multiples of the uncrossed off number (i.e. if 4, then cross off every 4th number)
	//must work with 15485863 
	
}
