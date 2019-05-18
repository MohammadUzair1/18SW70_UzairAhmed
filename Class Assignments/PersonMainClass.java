class PersonMainClass{
	public static void main(String[] args) {
	Person p=new Person();
	p.personInfo("Uzair",18);
	Student s=new Student();
	s.studentInfo(70);
	Employee e=new Employee();
	e.employeeInfo(2212);
	Undergraduate u=new Undergraduate();
	u.Info("Software");
	Graduate g=new Graduate();
	g.graduateInfo(500.0,380.0);
	Faculty f=new Faculty();
	f.facultyInfo("Software");
	Staff x=new Staff();
	x.staffInfo("SirJunaid","SirNaeem","MisMaryam");
	Masters m=new Masters();
	m.mastersInfo("M.E");
	Doctoral d=new Doctoral();
	d.doctoralInfo("Ph.D");
	}
}