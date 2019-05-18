class Person{
	String name;
	int age;
	public void personInfo(String name, int age){
		this.name=name;
		this.age=age;
		System.out.println("Person's name: "+name);
		System.out.println("Person's age: "+age);
	}
}
class Student extends Person{
	int rollno;
	public void studentInfo(int r){
		rollno=r;
		System.out.println("Student's roll number: "+rollno);
	}
}
class Employee extends Person{
	int id;
	public void employeeInfo(int id){
		this.id=id;
		System.out.println("Employee id number: "+id);
	}
}
class Undergraduate extends Student{
	String dept;
	public void Info(String d){
		dept=d;
		System.out.println("Department: "+dept);
	}
}
class Graduate extends Student{
	double totalMarks;
	double obtMarks;
	public void graduateInfo(double t, double o){
		totalMarks=t;
		obtMarks=o;
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Obtained Marks: "+obtMarks);
	}
}
class Faculty extends Employee{
	String faculty;
	public void facultyInfo(String f){
		faculty=f;
		System.out.println("Faculty: "+faculty);
	}
}
class Staff extends Employee{
	String t1;
	String t2;
	String t3;
	public void staffInfo(String t1, String t2, String t3){
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
		System.out.println("Teacher1 name: "+t1);
		System.out.println("Teacher2 name: "+t2);
		System.out.println("Teacher3 name: "+t3);
	}
}
class Masters extends Graduate{
	String degree;
	public void mastersInfo(String degree){
		this.degree=degree;
		System.out.println("Degree: "+degree);
	}
}
class Doctoral extends Graduate{
	String degree;
	public void doctoralInfo(String d){
		degree=d;
		System.out.println("Degree: "+degree);
	}
}

