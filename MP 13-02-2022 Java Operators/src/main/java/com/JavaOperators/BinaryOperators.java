package com.JavaOperators;

public class BinaryOperators {

	public static void main(String[] args) {
		int a=20, b=10, c=5;
		int sum,sub,mul,div,mode;
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		mode=a%b;
	//Arithmetic operators
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mode);
	//Relational operators
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);
	//Logical operators
		System.out.println(a>b&&b>c);
		System.out.println(a==b||b==c);
		System.out.println(a!=b);
	//Assignment operators
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
	}

}
