package com.bridgelabz.Algorihm;

import java.util.Random;
import java.util.Scanner;

public class Coupan 
{
	public static void main(String[] args) 
	{
		//Creating instance of Random Class
		Random random_number = new Random();

		Scanner object= new Scanner(System.in);
		System.out.println("Enter Coupon Number:");
	
		int coupon = object.nextInt();
		int distinct = 0, count = 0;
		int[] collection = new int[coupon];
		
		for(int i=1; i<=coupon; i++)
		{
			int random_no= random_number.nextInt(1000);
			System.out.println("Generating Distinct Random Numbers for Entered Coupon Number:"+random_no);
		}
		while(distinct < coupon)
		{
			int value = (int) (Math.random()*coupon);
			count++;
			if(collection[value]!=1)
			{
				distinct++;
				collection[value]=1;
			}
		}
		System.out.println("Total no of trials to get "+coupon+" different coupon number's are "+count);

		object.close();
	}

	
	}


