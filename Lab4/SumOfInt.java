import java.util.Scanner;
class SumOfInt{
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int n,numb;
		int sum=0;
		n=scnr.nextInt();
	
		for (int i=1; i<=n; i++) {
			System.out.println("Enter a Number: ");
			numb=scnr.nextInt();
			sum=sum+numb;
			
		}
		System.out.println(sum);

	}
}