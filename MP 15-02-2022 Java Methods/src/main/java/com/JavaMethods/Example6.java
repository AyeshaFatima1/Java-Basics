package com.JavaMethods;

import java.util.Scanner;
//write a java program for calculate by using methods,Scanner object,switch-case and while loop.
 
public class Example6 {
 
  static int num1,num2,sum,sub,product,division,mode;
  static Scanner scanner=new Scanner(System.in);
  //Sum of two numbers
  public static void addition() {
	    System.out.println("Enter First value:");
	    num1=scanner.nextInt();
	    
	    System.out.println("Enter Second value:");
	    num2=scanner.nextInt();
	    
	    sum=num1+num2;
	    System.out.println("Sum:"+sum);
	    System.out.println();
  }
	    //subtraction of two numbers
  public static void subtraction() {
	    System.out.println("Enter First value:");
	    num1=scanner.nextInt();
	    
	    System.out.println("Enter Second value:");
	    num2=scanner.nextInt();
	    
	    sub=num1-num2;
	    System.out.println("Sub:"+sub);
	    System.out.println();
  }
	    //Product of two numbers
  public static void product() {
	    System.out.println("Enter First value:");
	    num1=scanner.nextInt();
	    
	    System.out.println("Enter Second value:");
	    num2=scanner.nextInt();
	    
	    product=num1*num2;
	    System.out.println("Product:"+product);
	    System.out.println();
  }
	    //Division of two numbers
  public static void division() {
	   System.out.println("Enter First value:");
	   num1=scanner.nextInt();
		    
	   System.out.println("Enter Second value:");
	   num2=scanner.nextInt();
		    
	    division=num1/num2;
	    System.out.println("Division:"+division);
	    System.out.println();
  }
	    //Mode of two numbers
 public static void mode() {
		System.out.println("Enter First value:");
		num1=scanner.nextInt();
		    
	    System.out.println("Enter Second value:");
		num2=scanner.nextInt();
		    
	    mode=num1%num2;
	    System.out.println("Mode:"+mode);
	    System.out.println();
 }
 public static void main(String[] agrs)
 {
	 while(true) {
	 System.out.println("***** Operations Menu*****");
	 System.out.println("1. Addition");   
	 System.out.println("2. Subtraction");   
	 System.out.println("3. Product");   
	 System.out.println("4. Division");   
	 System.out.println("5. Mode");   
	 System.out.println("6. Stop");
	 
	 System.out.println("select your Operation:");
	 int operation=scanner.nextInt();
	 
	 switch(operation) {
	 case 1:
		 addition();
		 break;
	 case 2:
		 subtraction();
		 break;
	 case 3:
		 product();
		 break;
	 case 4:
		 division();
		 break;
	 case 5:
		 mode();
		 break;
	 case 6:
		 System.exit(0);
		 break;
		 default:
		 System.out.println("Select valid Operation...!");
    
		}

	}

	}

}
