package com.typesofArrays;

public class Example2 {

	public static void main(String[] args) {
    //single dimensional array
		
    //single dimensional array in a multiple line(array declaration and initialization)
	//array declaration
	int employeeids[] = new int[5];//array object creation
	
	//array initialization
	employeeids[0]=345;
	employeeids[1]=367;
    employeeids[2]=456;
	employeeids[3]=378;
	employeeids[4]=390;
	
	for(int id:employeeids) 
	{
		System.out.println(id);	
			
		}
	}

}
