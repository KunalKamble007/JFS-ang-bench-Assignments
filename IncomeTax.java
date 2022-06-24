package com.capg.assignments;

import java.util.Scanner;

public class IncomeTax {

	public static void calculateTaxAmount(double ctc) {
		 if(ctc<=180000){
	            System.out.println("Taxed Amount for ctc "+ctc+ ": "+0.0);
	        }
	        if(ctc>181000&&ctc<300001){
	            System.out.println("Taxed Amount for ctc  "+ctc+ ": "+ctc*0.1);
	        }
	        if(ctc>300000&&ctc<500001){
	            System.out.println("Taxed Amount for ctc "+ctc+" : "+ctc*0.2);
	        }
	        if(ctc>500000&&ctc<1000001){
	            System.out.println("Taxed Amount for ctc "+ctc+" : "+ctc*0.3);
	        }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ctc amount to calculate tax");
		double ctc = sc.nextInt();

        calculateTaxAmount(ctc);

	}
}
