package com.javaMethods;

public class Example3 {
	
	//method with no parameter
	public void display1() {
		System.out.println("method without parameter");
	}
	//method with single parameter
	public void display2(int a) {
		System.out.println("method with single parameter"+a);
	}
	public static void main(String[] args) {
		//create an object of main
	    Example3 obj=new Example3();
	    
		// calling method with no parameter
		obj.display1();
		//calling method with single parameter
		obj.display2(24);
	}

}
