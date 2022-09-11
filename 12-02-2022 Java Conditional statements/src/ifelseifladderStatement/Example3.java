package ifelseifladderStatement;

public class Example3 {

	public static void main(String[] args) {
		int i=9;
		//condition 1
		if(i==10) { 
		System.out.println("i is 10");
		}
		//condition 2
		else if(i==15) {
	    System.out.println("i is 15");
		}
		//condition 3
		else if(i==20) {
		System.out.println("i is 20");
		}
		else {
		System.out.println("i is not present");
		}
		
		System.out.println("Outside if-else-if");

	}

}
