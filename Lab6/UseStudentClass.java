class UseStudentClass{
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		Student s6=new Student();
		Student s7=new Student();
		Student s8=new Student();
		Student s9=new Student();
		Student s10=new Student();
		s1.setinfo("Uzair Ahmed",18,"Society phase-1 Jamshoro");
		s2.setinfo("Usama Shaikh",18,"Rashidi Hostel MUET Jamshoro");
		s3.setinfo("Ahmed Ali",18,"Qasim Abad Hyderabad");
		s4.setinfo("Waqar Ali",19,"Phase-1 Gulshan e Hadid Karachi");
		s5.setinfo("Mudasir Ali",18,"Qasim Abad Hyderabad");
		s6.setinfo("Abdul Qudoos",18,"Qasim Abad Hyderabad");
		s7.setinfo("Anees Ahmed",18,"Society phase-2 Jamshoro");
		s8.setinfo("Imtiaz Ahmed",18,"Shaikh Abdul Majid Hostel MUET Jamshoro");
		s9.setinfo("Abdul Jabbar",18,"Rashidi Hostel MUET Jamshoro");
		s10.setinfo("Abdul Musawir",18,"Society phase-1 Jamshoro");
		Student s[]={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
		for (int i=0; i<s.length; i++) {
			s[i].showdata();	
		}
		
	}
}