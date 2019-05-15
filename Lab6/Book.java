class  Book{
	private String name;
	private Author[] authors;
	private double price;
	private int qty;
	public Book(String name, Author[] authors, double price){
		this.name=name;
		this.authors=authors;
		this.price=price;
	}
	public Book(String name, Author[] authors, double price, int qty){
		this.name=name;
		this.authors=authors;
		this.price=price;	
		this.qty=qty;
	}
	public String getName(){
		return name;
	}
	public Author[] getAuthors(){
		return authors;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}
	public void setQty(int qty){
		this.qty=qty;
	}
	public int getQty(){
		return qty;
	}
	public String toString(){

		String authorsList="";
		for (int i=0; i<authors.length; i++) {
			if (i==authors.length-1) {
				authorsList+=authors[i].toString();
				
			}
			else {
				authorsList+=authors[i].toString()+",";
			}
		}
		return "Book[name: "+name+","+authorsList+", price: "+price+", qty: "+qty;
	}
	public String getAuthorNames(){
		String names="";
		for (int i=0; i<authors.length; i++) {
			if (i==authors.length-1) {
				names+=authors[i].getName();
				
			}
			else {
				names+=authors[i].getName()+",";
			}
		}
		return names;
	}
}