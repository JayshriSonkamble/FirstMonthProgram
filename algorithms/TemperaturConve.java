package com.bridgelabz.Algorihm;

import java.util.Scanner;

		public class TemperaturConve extends FC_Utilclass
		{

			public static void main(String[] args) {

		    double f,c;
	             	    Scanner scanner=new Scanner(System.in);
		    System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
	                   int ch=scanner.nextInt();
		    switch(ch)
		    {
		    case 1:  System.out.println("Enter  Fahrenheit temperature");
	                   	  f=scanner.nextDouble();
	                   	FC_Utilclass.Tempretureconversion(f,'c');
			  break;
		    case 2:  System.out.println("Enter  Celsius temperature");
	                   	  c=scanner.nextDouble();
	                   	FC_Utilclass.Tempretureconversion(c,'f');
			  break;
		    	default:  System.out.println("please choose valid choice");
		   } 

	

	}

}
