package com.capg.assignments;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = s.nextInt();
		
		int numcount = count(num);
		System.out.println(numcount);
		
		int temp = num;
		int sum = 0;
		
		while(num>0)
		{
			int rem = num % 10;
			sum = sum + power(rem,numcount);
			
			num /=10;
		}
		
		if(sum==temp)
		{
			System.out.println("It is an Armstrong Number");
		}
		else
		{
			System.out.println("It is not an Armstrong Number");
		}
	}

	

	public static int count(int a) {
		// TODO Auto-generated method stub
		int count = 0;
		
		while (a>0) {
			a/=10;
			count++;
		}
		return count;
	}
	
	public static int power(int base, int power) {
		// TODO Auto-generated method stub
		int ans=1;
		for(int i=1; i<=power;i++)
		{
			ans = ans*base;
		}
		return ans;
	}
}
