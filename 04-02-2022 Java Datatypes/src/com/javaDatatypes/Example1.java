package com.javaDatatypes;

public class Example1 {

	//if we want to define the variables before main, then it should be define with static keyword.
	static int customerid=1243;
	static String customername="Ayesha";
	static String customeraddress="Hyderabad";
	
	//if we declare method as a static then we can call that method with className.methodName/only by methodName in main,no need to create object.
	static public void get() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
	//Write a java program to print customer information(id,name,and address).
	
		Example1.get();
		//get();
		/*Example1 e=new Example1();
		e.get();*/
		
		System.out.println(customerid);
		System.out.println(customername);
		System.out.println(customeraddress);
		
	}

}
