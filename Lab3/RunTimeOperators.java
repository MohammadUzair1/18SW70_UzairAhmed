class RunTimeOperators
{
	public static void main(String[] args){
		String a=args[0];
		String b=args[1];
		String c=args[2];
		int d=Integer.parseInt(a);
		int e=Integer.parseInt(b);
		if(c.equals("+")){
			System.out.println("Addition is: "+(d+e) );

		}
		else if(c.equals("-")){
			System.out.println("Addition is: "+(d-e) );
        }
     else if(c.equals("*")){
			System.out.println("Addition is: "+(d*e) );
        }
        else if(c.equals("/")){
			System.out.println("Addition is: "+(d/e) );
        }
	}
	
}