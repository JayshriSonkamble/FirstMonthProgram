package com.bridgelabz.Algorihm;

public class HelloString {

	public static void main(String[] args) {
		
		
		  String str=new String("hello fun,how are you");
		  System.out.println("Original String"); System.out.println(str);
		  
		  System.out.println("after string replace");
		  System.out.println(str.replaceAll("(.*)fun(.*)","main"));
		 
		
		
	}

}
