package com.capg.assignments;

import java.util.Scanner;

public class SimpleAndCompound {
public static void main(String[] args) {
	

	 double p, r, t, simple_interest, compound_interest;
     Scanner sc = new Scanner (System. in);
     
     System.out.println("Enter the value of Principal = ");
     p = sc.nextDouble();
     
     System. out. println("Enter the Annual Rate of Interest = ");
     r = sc.nextDouble();
     
     System. out. println("Enter the Time (years) = ");
     t = sc.nextDouble();
     
     simple_interest = (p * r * t)/100;
     System.out.println("Simple Interest: "+simple_interest);
     
     compound_interest = p * Math.pow(1.0+r/100.0,t) - p;
     System.out.println("Compound Interest: "+compound_interest);
}
}