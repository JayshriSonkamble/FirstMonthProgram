package com.bridgelabz.Algorihm;

import java.util.Scanner;

public class PalinReverseNum {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int number, temp, sum = 0, result;
		
        @SuppressWarnings("resource")
        
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter any number:");
        number  = scanner.nextInt();
        temp = number ;
        
        while(number > 0)
        {
            result= number % 10;  // 1 // 2 // 1
            
            sum = (sum* 10) + temp;	// 121 reverse the num
            
            number = number / 10; //12
        }
        
        if(sum == temp) 	
        {
            System.out.println("Given number "+temp+" is Palindrome");
        }
        else
        {
            System.out.println("Given number "+temp+" is Not Palindrome");
        }


	}

}
