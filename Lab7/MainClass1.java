class MainClass1{
	public static void main(String[] args) {
		Circle c1=new Circle(4.2,"red");
		System.out.println("Area of Circle: "+c1.getArea());
		System.out.println(c1.toString());
		Cylinder c2=new Cylinder(5.6,3.1,"Yellow");
		System.out.println("Volume of Cylinder: "+c2.getVolume());
	}
}