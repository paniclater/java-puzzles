package com.paniclater.puzzles.strings;


public class BaseRemove {
	public static void main(String[] args) {
		BaseRemove br = new BaseRemove();
		System.out.println(br.withoutRemove("This is a FISH", "IS"));
	}
	
	public String withoutRemove(String base, String remove) {
	String removeLower = remove.toLowerCase();
	String baseLower = base.toLowerCase();
	int length = remove.length();
	int count = base.length() + 1;
	for(int i = 0; i < count; i++) {
		if(baseLower.substring(i, i + length).equals(removeLower)) {
			base = base.replace(base.substring(i, i + length), "");
			count = base.length() + 1;
			i += length;
		}
	}
	return base;
		
	}
}
