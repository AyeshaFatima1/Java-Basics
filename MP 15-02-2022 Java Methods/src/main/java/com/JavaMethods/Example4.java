package com.JavaMethods;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
    int num1,num2,sum,sub,product,division,mode;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter First value:");
    num1=scanner.nextInt();
    
    System.out.println("Enter Second value:");
    num2=scanner.nextInt();
    
    //sum of two numbers
    sum=num1+num2;
    System.out.println("Sum:"+sum);
    
    System.out.println("=====================");
    
    //subtraction of two numbers
    sub=num1-num2;
    System.out.println("Sub:"+sub);
    
    System.out.println("=====================");
    
    //Product of two numbers
    product=num1*num2;
    System.out.println("Product:"+product);
    
    System.out.println("=====================");
    
    //Division of two numbers
    division=num1/num2;
    System.out.println("Division:"+division);
    
    System.out.println("=====================");
    
    //Mode of two numbers
    mode=num1%num2;
    System.out.println("Mode:"+mode);
    
    scanner.close();    
	}

}
