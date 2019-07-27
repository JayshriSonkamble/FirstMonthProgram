package com.bridgelabz.Algorihm;

public class FC_Utilclass
{
	// function to  Tempretureconversion static function
	
	public static void Tempretureconversion(double temp,char m)
	{
		if (m=='f')
		{
			  double f=((9*temp)/5)+32;
			  System.out.println("farenhit"+f);
		}
		else if(m=='c')
		{ 
			  double c=(temp-32)*5/9;
			  System.out.println("celsius"+c);
		}
		
	}

	//function to calculate Monthly payment details
	
	public static double monthlyPayment(double principal,double years,double roi)
	{	
		double payment;
		roi=roi/(12*100);  //roi amount
		years=years*12; 
  
		payment= (principal*roi)/(1-Math.pow(1+roi/(12*100),12*years));
		return payment;
		
	}

	private String[] args;
	
	//function to static function sqrt to compute the square root of a nonnegative number c using Newton's method
	
	public static double Sqrt(double c)
	{
	
		double epsilon = 1e-15;   // relative error tolerance
		double t = c ;             // estimate of the square root of c

  
		while (Math.abs(t - c/t) > epsilon*t)
		{
			t = (c/t + t) / 2.0;
		}
		return t;
		
}
	// function to Binary Search the Word from Word List
	 
	public static int BinarySearch(int counter,int num,int item,int array[],int first, int last,int middle)
	{
		first = 0;
		last = num - 1;
		middle = (first + last)/2;
	
		while( first <= last )
		{
			if ( array[middle] < item )
				first = middle + 1;
			else if ( array[middle] == item )
			{
				System.out.println(item + " found at location " + (middle + 1) + ".");
				break;
			}
			else
			{
				last = middle - 1;
			}
				middle = (first + last)/2;
		}
				if ( first > last )
					System.out.println(item + " is not found.\n");
				
				return first;

				//Palindrome
				
				
				boolean Palindrome(int num1) {  
					  int num1 = num1;  
					  int rem;  
					  int result = 0;  
					  while (num1 > 0) {  
					   rem = num1 % 10;  
					   num1 = num1 / 10;  
					   result = (result + rem) * 10;  
					  }  
					  result /= 10;  
					  if (result == num1) {  
					   return true;  
					  } else {  
					   return false;  
					  }  
					 }  
	
	}

}
	
