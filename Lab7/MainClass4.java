class MainClass4{
	public static void main(String[] args) {
		Shape s=new Shape("blue",true);
		System.out.println(s.toString());
		Circle c=new Circle(12.0,"blue",true);
		System.out.println(c.toString());
		Rectangle r=new Rectangle(20.0,14.5);
		System.out.println(r.toString());
		Square sq=new Square(18.0);
		System.out.println(sq.toString());
	}
}