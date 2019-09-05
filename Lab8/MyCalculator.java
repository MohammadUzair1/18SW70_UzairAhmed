import java.util.Scanner;
interface AdvancedArithematic{
	int sumOfFactors(int n);
}
class MyCalculator implements AdvancedArithematic{
	Scanner scr=new Scanner(System.in);
	int n = scr.nextInt();
	int i;
	public int sumOfFactors(int n){
		for (i=1; i<=n; i++) {
		if(n%i==0){
			n+=n;
			}
		}
		return n;
	}
	public static void main(String[] args) {
	MyCalculator x =new MyCalculator();
	System.out.println(x.sumOfFactors(x.n));	
	}
}