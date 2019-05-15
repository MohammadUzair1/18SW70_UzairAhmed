class StaticKeyword{
	static String name;
	static String f;
	public static void setdata(String n, String x){
		name=n;
		f=x;
	}
	public static void getname(){
		System.out.println("Name: "+name);
	}
	public static void getf(){
		System.out.println("Father's name: "+f);
	}
}