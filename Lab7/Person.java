class  Person{
	private String name;
	private String address;
	public Person(String name, String address){
		this.name=name;
		this.address=address;
	}
	public String getName(){
		return name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	public String toString(){
		return "Person[name: "+name+", address: "+address+"]";
	}
}
class Student extends Person{
	private String program;
	private int year;
	private double fee;
	public Student(String name, String address, String program, int year, double fee){
		super("Uzair","Society phase-1");
		getName();
		setAddress(address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public void setProgram(String program){
		this.program=program;
	}
	public String getProgram(){
		return program;
	}
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return year;
	}
	public void setFee(double fee){
		this.fee=fee;
	}
	public double getFee(){
		return fee;
	}
	public String toString(){
		return "Student[Person[name: "+getName()+", address: "+getAddress()+"]"+", program: "+program+", year: "+year+",fee: "+fee+"]";
	}
}
class Staff extends Person{
	private String school;
	private double pay;
	public Staff(String name, String address, String school, double p){
		super("Uzair","Society phase-1");
		getName();
		setAddress(address);
		this.school=school;
		pay=p;
	}
	public void setSchool(String school){
		this.school=school;
	}
	public String getSchool(){
		return school;
	}
	public void setPay(double pay){
		this.pay=pay;
	}
	public double getpay(){
		return pay;
	}
	public String toString(){
		return "Staff[Person[name: "+getName()+", address: "+getAddress()+"], school: "+school+", pay: "+pay+"]";	
	}
}