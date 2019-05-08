import java.util.Scanner;
class TakingInputs{
	public static void main(String[] args) {
		
	
	Scanner scnr=new Scanner(System.in);
	System.out.println("Enter an Integer value= ");
    int a=scnr.nextInt();
    System.out.println("An Integer value is: "+a);
    System.out.println("Enter an String value= ");
    String b = scnr.next();
    System.out.println("An String value is: "+b);
    System.out.println("Enter an Float value= ");
    float c=scnr.nextFloat();
    System.out.println("An Float value is: "+c);



    }
}    
