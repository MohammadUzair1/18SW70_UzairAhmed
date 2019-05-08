class Dog{
	String name;
	String breed;
	int age;
	void setdetails(String  n,String b,int a){
			name=n;
			breed=b;
			age=a;    
	}
	void showdetails(){
		if (name!=null && breed!=null && age!=0) {
			
		
		System.out.println("Name: "+name);
		System.out.println("Breed: "+breed);
		System.out.println("Age: "+age+"years");
		}
	else{
          System.out.println("details are unavailable");
		}
	}

}