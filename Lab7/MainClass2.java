class MainClass2{
	public static void main(String[] args) {
		Person p=new Person("Uzair","Society phase-1");		
		System.out.println(p.toString());
		Student s=new Student("Waqar","Society phase-2","B.E",2019,16000.0);
		System.out.println(s.toString());
		Staff st=new Staff("Xyz","abc phase-1","Govt High School",10000.0);
		System.out.println(st.toString());
	}
}