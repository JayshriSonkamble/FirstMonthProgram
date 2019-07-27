

package com.bridgelabz.Algorihm;

public class Sqrt 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		double c=Double.parseDouble(args[0]);
        double epsilon = 1e-15;    // relative error tolerance
        double t = c;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t)
        {
            t = (c/t + t) / 2.0;
        }
        // print out the estimate of the square root of c
        System.out.println("Square root value of c \n");
        System.out.println(t);
        
        FC_Utilclass.Sqrt(c);
        
        
    }
	
}