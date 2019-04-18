import java.util.*;
class ElectricityBill
{
	public static void main(String[] args) {
		int units=0,bill=0;
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter number of units: ");
        units=scnr.nextInt();
        if(units<=50){
        	bill=units*10;
        }
        else if(units>50 && units<=100)
        {
        	bill=(50*10)+((units-50)*15);
        }
        else if(units>100 && units<=200)
        {
        	bill=(50*10)+(50*15)+((units-100)*20);
        }
        else if(units>200 && units<=300)
        {
        	bill=(50*10)+(50*15)+(100*20)+((units-200)*25);
        }
        else if(units>=301)
        {
        	bill=(50*10)+(50*15)+(100*20)+(100*25)+((units-300)*30);
        } 
        System.out.println("Total Bill is: "+bill);	


	}
}