package com.JavaMethods;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
/*
 * write a java program to print learner information
 * (id,name,age and address)
 */
 int learnerid=17522;
 String learnername="Ayesha";
 int learnerage=22;
 String learneraddress="Hyderabad";
 
 Scanner scanner=new Scanner(System.in);
  
  System.out.println("Enter learner id:");
  learnerid=scanner.nextInt();
  
  System.out.println("Enter learner name:");
  learnername=scanner.next();
  
  System.out.println("Enter learner age:");
  learnerage=scanner.nextInt();
		 
  System.out.println("Enter learner address:");
  learneraddress=scanner.next();
  
  System.out.println("=======================");
  
  System.out.print("learner id:");
  System.out.println(learnerid);
  
  System.out.print("leraner name:");
  System.out.println(learnername);
  
  System.out.print("leraner age:");
  System.out.println(learnerage);
  
  System.out.print("leraner address:");
  System.out.println(learneraddress);
  
  scanner.close();
  
	}
 
}
