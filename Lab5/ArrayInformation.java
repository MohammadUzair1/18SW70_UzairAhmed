import java.util.Scanner;
class ArrayInformation{
	int A[]=new int[5];
	public void populateArray(){
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter Array elements: ");
		for (int i=0; i<A.length; i++) {
			
		
		A[i]= scnr.nextInt();
        }
	}
	public void printArray(){
		int odd=0,even=0;
		for (int i=0; i<A.length; i++) {
			
		  if(A[i]%2==0){
		  	even++;

		    }
		}  
		System.out.println("Even numbers: "+even);    
		   for (int i=0; i<A.length; i++) {
		    	
		    
		   if(A[i]%2!=0){
		  	System.out.println(A[i]);
		  	odd++;
 			}

	    }
	    System.out.println("odd numbers: "+odd);


    }  
}
