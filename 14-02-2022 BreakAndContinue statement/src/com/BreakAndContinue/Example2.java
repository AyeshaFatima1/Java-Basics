package com.BreakAndContinue;

public class Example2 {

	public static void main(String[] args) {
		/*for(int i=1; i<=10; i++)
		{
			if(i==7)
			{
				continue;//continue statement
			}
			System.out.println(i);
		}*/
		
		/*for(int i = 0; i<= 2; i++) {  
			  
			for (int j = i; j<=5; j++) {  
			  
			if(j == 4) {  
			continue;  
			}  
			System.out.println(j);  
			}  
		}*/ 
		
		/*for(int i=1;i<=3;i++){    
            //inner loop  
            for(int j=1;j<=3;j++){    
                if(i==2&&j==2){    
                    //using continue statement inside inner loop  
                    continue;    
                }    
                System.out.println(i+" "+j);    
            }    
        }*/ 
		
		/* aa:  
	        for(int i=1;i<=3;i++){    
	           bb:  
	              for(int j=1;j<=3;j++){    
	                 if(i==2&&j==2){    
	                  //using continue statement with label  
	                    continue aa;    
	                    }    
	                    System.out.println(i+" "+j);    
	                }    
	            }*/
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				if(j==3) {
					continue;
				}
				System.out.println(i+" "+j);
			}
		}
		
	}

}
