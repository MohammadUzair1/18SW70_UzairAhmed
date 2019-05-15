class UseAuthor{
	public static void main(String[] args) {
		Author a=new Author("Uzair","mohmuzair@gmail.com",'m');
		a.getName();
		a.getGender();
		a.getEmail();
		System.out.println(a.toString());
	}
}