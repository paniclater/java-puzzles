package com.paniclater.puzzles.fibonacci;

public class GetValue {
	private double prev;
	private double current;
	private double sum;
	private double count;

	public GetValue(double count) {
		super();
		this.count = count;
	}

	public void go() {
		for (double i = 0; i < count; i++) {
			if(i == 0) {
				System.out.println(0);
				prev = 0;
			} else if (i == 1) {
				System.out.println(1);
				current = 1;
			} else {
				sum = prev + current;
				prev = current;
				current = sum;
				System.out.println(sum);
				
			}
		}
	}

}
