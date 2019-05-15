class Student{
	String name;
	int age;
	String address;
	public Student(){
		name="Unknown";
		age=0;
		address="not available";
	}
	public void setinfo(String name, int age){
		this.name=name;
		this.age=age;
	}
	public void setinfo(String name, int age, String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void showdata(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
	}
}