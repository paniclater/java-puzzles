package com.paniclater.puzzles.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibFinder {
	// given two numbers that are supposedly in the fibonacci sequence and a
	// range value,
	// return the next values in the fibonacci sequence in the range
	public List<Double> getNextValues(double first, double second, double count) {
		// make sure they are positive integers
		checkPositive(first, second, count);
		//make sure the first is smaller than the second
		checkFirstSmaller(first, second);
		//check if they pass the mathematical test for fibonacci sequence members
		checkFib(first);
		checkFib(second);
		List<Double> results = new ArrayList<Double>();
		for (int i = 0; i < count; i++) {
			results.add(first + second);
			first = second;
			second = results.get(i);
		}
		return results;
	}
	
	
	private void checkPositive(double first, double second, double count) {
		if (first < 0 || second < 0 || count < 0) {
			throw new IllegalArgumentException(
					"Please only input positive integers.");
		}

	}

	private void checkFirstSmaller(double first, double second) {
		if (second < first) {
			throw new IllegalArgumentException(
					"Please input consecutive members in order from the fibonacci sequence for the first two values.");
		}
	}

	

	private void checkFib(double possibleFib) {
		//Stack overflow said that one way to check if a number is a member of the Fibonnaci sequence is to evaluate if
		//5 * n ^ 2 + 4 OR 5 * n ^ 2 - 4is a perfect square, referenced here http://en.wikipedia.org/wiki/Fibonacci_number#Recognizing_Fibonacci_numbers 
		double positiveCheck = 5 * Math.pow((possibleFib), 2) + 4;
	    double negativeCheck = 5 * Math.pow((possibleFib), 2) - 4;	    
	    if(!isWholeNumber(Math.sqrt(positiveCheck)) && !isWholeNumber(Math.sqrt(negativeCheck))) {
	    	throw new IllegalArgumentException("Please enter a valid fibonacci number for the first two inputs");
	    }


		
	}
	private boolean isWholeNumber(double num)
	{
	    return num - Math.round(num) == 0;    
	}
}
