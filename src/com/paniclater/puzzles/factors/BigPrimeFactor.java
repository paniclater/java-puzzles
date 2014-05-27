package com.paniclater.puzzles.factors;

public class BigPrimeFactor {
	long results = 0;

	public void goBig() {
		long source = 600851475143l;
		System.out.println(Long.MAX_VALUE);
		System.out.println(source);
		System.out.print(findHighestPrimeFactor(source));
	}

	public long findHighestPrimeFactor(long source) {
		for (long h = source - 1; h > 1; h--) {
			System.out.print("*");
			if(source % h == 0) {
				//System.out.println(h);
				results = h;
				//findHighestPrimeFactor(h);
				break;
			}
		}
		return results;
}
	
}
