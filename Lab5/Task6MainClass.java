class Task6MainClass{
	public static void main(String[] args) {
		StudentInfo x=new StudentInfo("Uzair",18,70);
		MarkSheet y=new MarkSheet(90.0,90.0,90.0);
		x.setdata("Software","MUET JAMSHORO");
		StudentMarksheet sm=new StudentMarksheet(x,y);
		sm.createStudentResult();
	}
}