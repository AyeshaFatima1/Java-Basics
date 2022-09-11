package com.callingJavaMethods;

import java.util.Scanner;

public class Example4 {

 //write a java program to calculate sum of two numbers using method
 public static int getSum(int num1, int num2) {
	return num1+num2;
	}
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter First value:");
	int a=scanner.nextInt();
	
	System.out.println("Enter Secound value");
	int b=scanner.nextInt();
 //calling method
	int sum=getSum(a,b);
	
	System.out.println("Sum:"+sum);
	scanner.close();
}

}
