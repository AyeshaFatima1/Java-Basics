package com.nestedifelseStatement;

public class Example4 {

	public static void main(String[] args) {
	
		int i=15;
		if(i==15) {
		//First if statement
		if(i<15)
		System.out.println("i is smaller than 15");
		// Nested if statement
		// will only be executed if statement above it is true
		if(i<20)
		System.out.println("i is smaller than 20 too");
		else
		System.out.println("i is greater than 15");
		
		}
		
	}

}
