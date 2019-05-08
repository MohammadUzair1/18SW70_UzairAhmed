class MarkSheet{
	double pst,eng,cp;
	int totalmarks;
	double obt;
	double perc;
	char grade;
	MarkSheet(double s1,double s2,double s3){
		pst=s1;
		eng=s2;
		cp=s3;
	}
	public int totalMarks(){
		totalmarks=300;
		return totalmarks;	
	}
	public double obtainedMarks(){
		obt=pst+eng+cp;
		return obt;
	}
	public double percentage(){
		perc=obt*100/totalmarks;
		return perc;
	}
	public char grade(){
		if (perc>=80) {

		System.out.println("Grade: A1"+grade);	
		}
		else if (perc>=70 && perc<=79) {
			System.out.println("Grade: A"+grade);
			
		}
		else if (perc>=60 && perc<=69) {
		
		System.out.println("Grade: B"+grade);	
		}
		else if (perc<60) {
			System.out.println("Grade: FAIL"+grade);
		}
		return grade;
	}
	public void getdata(){
		System.out.println("Total marks: "+totalmarks);
		System.out.println("Obtained marks: "+obt);
		System.out.println("Overall percentage: "+perc+"%");
		System.out.println(grade);

	}	
}