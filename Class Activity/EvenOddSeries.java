class EvenOddSeries
{
	public static void main(String[] args) {
        int x=1;
		while(x<=100)
		{
			x+=2;
			System.out.print(" "+x);

		}
		System.out.println();
		for(int y=2; y<=100; y+=2)
		{
		    System.out.print(" "+y);	
		}
	}
}