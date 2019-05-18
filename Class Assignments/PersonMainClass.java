class PersonMainClass{
	public static void main(String[] args) {
		Doctoral d=new Doctoral();
		Masters m=new Masters();
		Undergraduate u=new Undergraduate();
		Staff s=new Staff();
		Faculty f=new Faculty();
		d.personInfo("Uzair",18);
		u.studentInfo(70);
		s.employeeInfo(223476);
		u.getInfo("Sotware");
		m.graduateInfo(500.0,394.5);
		f.facultyInfo("SoftwareEngineering");
		s.staffInfo("SirNaeem","SirJunaid","MadamMariam");
		m.mastersInfo("M.E");
		d.doctoralInfo("Ph.D");
		
	}
}