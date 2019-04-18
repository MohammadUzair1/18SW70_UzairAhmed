import java.util.*;
class MarkSheet
{
	public static void main(String[] args) {
		int sub1=0,sub2=0,sub3=0;
		Scanner scnr= new Scanner(System.in);
		System.out.println("Enter marks obtained in C++");
	    sub1=scnr.nextInt();
	    System.out.println("Enter marks obtained in Data Structures");
	    sub2=scnr.nextInt();
	    System.out.println("Enter marks obtained in Operating systems");
	    sub3=scnr.nextInt();
	    int obt =sub1+sub2+sub3;
	    System.out.println("Total marks obtained out of 300 are:"+obt);
	    float perc=obt*100/300f;
	    System.out.println("Percentage: "+perc+"%");
	    if(perc>90){
	        System.out.println("Grade: A");
	    }
	    else if(perc>=80 && perc<=90){
	        System.out.println("Grade: B");
	    }
	    else if(perc>=70 && perc<=79){
	        System.out.println("Grade: C");
	    }
	    else if(perc>=60 && perc<=69){
	        System.out.println("Grade: D");
	    }
	    else if(perc<60)
	    {
	    	System.out.println("Grade: FAIL");
	    }	


	}



}