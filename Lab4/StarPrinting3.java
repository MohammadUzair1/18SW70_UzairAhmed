class StarPrinting3{
	public static void main(String[] args) {
		int a=1;
		for (int rows=1; rows<=5; rows++) {
			for(int spaces=5; spaces>rows; spaces--){
                 System.out.print(" ");
			}
			for (int x=1; x<=a; x++) {
				System.out.print("*");
				
			}
			System.out.println();
			a+=2;
		}
    }
}