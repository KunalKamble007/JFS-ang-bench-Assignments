package com.capg.assignments;

import java.util.Scanner;

public class AverageMarks {

	
	
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		int java, python, c;
		
		double total,Average;
		
		System.out.println("Please enter the three subject marks:");
		java=sc.nextInt();
		python=sc.nextInt();
		c=sc.nextInt();
		
		total= java+python+c;
		Average=total/3;
		
		System.out.println("Total Marks="+ total);
		System.out.println("Average Marks="+ Average);
	}
}
