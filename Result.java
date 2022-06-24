package com.capg.assignments;

import java.util.Scanner;

public class Result {

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
			
			if(Average>=60)
			{
			System.out.println("You are pass ");
			}
			else if(Average>=60 && Average<=80)
			{
			System.out.println("You are Promoted ");
			}
			else if(Average>=50 && Average<60)
			{
			System.out.println("You are Fail ");
			}
			else
			{
			System.out.println("Fail ");
			}
}
}
