class StudentInfo{
	String  name;
    int age;
    int rollno;
    String dept;
    String uniname;
	StudentInfo(String n,int a, int r){
		name=n;
		age=a;
		rollno=r;

	}
	void setdata(String d, String u){
	dept=d;
	uniname=u; 
		
	}
	void showdata(){
		System.out.println("Name of student: "+name);
		System.out.println("Age of student: "+age);
		System.out.println("Roll no: of student: 18SW"+rollno);
		System.out.println("Department of student: "+dept);
		System.out.println("University: "+uniname);
	}
}