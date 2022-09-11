package com.JavaMethods;

import java.util.Scanner;

public class Example3 {

//Scanner: by using this we can read the data from keyboard(external device)
 public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in);
 int num1,num2,sum;
 System.out.println("Enter First value:");
 num1=scanner.nextInt();
    
 System.out.println("Enter Second value:");
 num2=scanner.nextInt();
    
 sum=num1+num2;
    
 System.out.println("sum of num1 and num2 is:"+sum);
 scanner.close();
    }

}
