package com.capg.assignments;

public class ArmstrongNoRange {

	public static void main(String[] args) {
		
		int i,j,k,result,temp;
		
		for(int num = 100; num<=999; num++)
		{
			temp = num;
			k=temp%10;
			temp=temp/10;
			
			j=temp%10;
			temp=temp/10;
			
			i=temp%10;
			result=(i*i*i)+(j*j*j)+(k*k*k);
			
			if(num==result)
			{
				System.out.println(num +"is Armstrong Number");
			}
		}
	}
}
