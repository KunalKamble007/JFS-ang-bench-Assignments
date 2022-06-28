package com.capg.string;

public class Append {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer(" String Buffer ");
		sb.append(" is a peer class of string ");
		System.out.println(sb);
		
		sb.insert(12, "It is used to at the specified index position");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
}
