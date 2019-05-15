class UseBook{
	public static void main(String[] args) {
		Author x1=new Author("Robert lafore","xyz@gmail.com",'m');
		Author x2=new Author("DL Theraja","abc@gmail.com",'m');
		Author []authors={x1,x2};
		Book y=new Book("C++",authors,1000,5);
		System.out.println(y.toString());
		System.out.println("Author Names: "+y.getAuthorNames());
	}
}