package com.paniclater.intstractor;

public class TestInstractor {
	
	public static void main(String[] args) {
		Intstractor intstractor = new Intstractor();
		System.out.println(intstractor.doIt("dywi23jssi88sjdhj1") == 22);
		System.out.println(intstractor.doIt("Dummy 99 Dummy 99") == 36);
		System.out.println(intstractor.doIt("1") == 1);
		System.out.println(intstractor.doIt("") == 0);
		
	}
}
