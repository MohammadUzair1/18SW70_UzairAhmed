class Identity
{
	    public static void main(String[] args) {
		String name= "Uzair";
		int totalmarks= 500;
		int obt= 400;
		double perc=obt*100/totalmarks;
		char grade = 'A';
		boolean a=true;
		boolean b=false;
		System.out.println("Name:"+name);
		System.out.println("Totalmarks:"+totalmarks);
		System.out.println("Obtained marks:"+obt);
		System.out.println("percentage:"+perc+"%");
		System.out.println("Grade:"+grade);

		if(obt>300){
			System.out.println("Status: PASS! "+a);
		} 
		else
		{
			System.out.println("Status: FAIL!"+b);
		}
	}
}