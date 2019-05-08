class StudentMarksheet{
	StudentInfo x;
	MarkSheet y;
	StudentMarksheet(StudentInfo x,MarkSheet y){
		this.x=x;
		this.y=y;
	}
	public void createStudentResult(){
		x.showdata();
		System.out.println("Total marks: "+y.totalMarks());
		System.out.println("Obtained marks: "+y.obtainedMarks());
		System.out.println("Overall percentage: "+y.percentage()+"%");
		System.out.println(y.grade());


	}	
	
}