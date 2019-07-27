package com.bridgelabz.Algorihm;

import java.util.Scanner;

public class MonthlyPayment
{

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			
				@SuppressWarnings("unused")
				double priamount, year, interest,payment;
			
			@SuppressWarnings("resource")
			 	Scanner scanner=new Scanner (System.in);
			 
			 	// Prompt user for details of loan
			    System.out.println("Enter the Principal amount:");
			    priamount=scanner.nextInt();
			    
			    System.out.println("Enter the No.of years:");
			    year=scanner.nextInt();
			    
			    System. out. println("Enter the Rate of  interest");
			    interest=scanner.nextFloat();
		
			   FC_Utilclass.monthlyPayment(priamount, year, interest);
		        
		}
	}
	
