import java.util.Scanner;
class Array{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();

		int i;
		for(i=0;i<arr.length;i++){
				if(num==arr[i]){
					System.out.println("Number Found.");
					System.out.print("location: "+i);
					break;
				}
				else if(i==arr.length-1){
					System.out.println("Number not Found.");
					
				}
		}

		
	
	}
} 