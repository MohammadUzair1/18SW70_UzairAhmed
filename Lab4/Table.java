import java.util.*;
class Table{
	public static void main(String[] args) {
	  Scanner scnr=new Scanner(System.in);
	  int table=scnr.nextInt();
	  int start=scnr.nextInt();
	  int end=scnr.nextInt();

	  for (int i=start; i<=end; i++) {
	  	System.out.println(table+" X "+i+" = "+table*i);
	  	
	  }

	}
}