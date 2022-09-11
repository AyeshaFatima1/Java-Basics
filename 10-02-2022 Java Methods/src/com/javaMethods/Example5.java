package com.javaMethods;

public class Example5 {
	//method defined
	private static int getsquare(int num) {
		return num*num;
	}

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			//method call
			int result=getsquare(i);
			System.out.println("square of"+ i +"is:"+result);
		}
	}

}
