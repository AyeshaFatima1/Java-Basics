package com.typesofArrays;

public class Example4 {

	public static void main(String[] args) {
    //multiple dimensional array
		
    //multiple dimensional array in a single line(array declaration and initialization)
	//array declaration
	int matrix[][] = {{345,367},{456,378}};
	
	for(int i=0; i<matrix.length; i++) 
	{
		for(int j=0; j<matrix.length; j++)
		{
		System.out.print(matrix[i][j]+"\t");	
			
		}
		System.out.println("\n\n\n");
	}
	
  }
}
