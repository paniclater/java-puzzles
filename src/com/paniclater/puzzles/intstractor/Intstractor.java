package com.paniclater.puzzles.intstractor;

public class Intstractor {
	public int doIt(String starter) {
		int result = 0;
		for(int i = 0; i < starter.length(); i++) {
			if(starter.substring(i, i + 1).matches("\\d")) {
				result += Integer.parseInt(starter.substring(i, i + 1));
			}
		}
		return result;
	}
}
