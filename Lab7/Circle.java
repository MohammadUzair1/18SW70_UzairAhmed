class Circle{
	private double radius;
	private String color;
	public Circle(){
		radius=1.0;
		color="red";
	}
	public Circle(double radius){
		this.radius=radius;
	}
	public Circle(double radius, String color){
		this.radius=radius;
		this.color=color;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public double getArea(){
		return (3.14*radius*radius);
	}
	public String toString(){
		return "Circle[radius="+radius+", color="+color+"]";
	}
}
class Cylinder extends Circle{
	private double height;
	public Cylinder(){
		height=1.0;
	}
	public Cylinder(double radius){
		setRadius(radius);

	}
	public Cylinder(double radius, double height){
		setRadius(radius);
		this.height=height;
	}
	public Cylinder(double radius, double height, String color){
		setRadius(radius);
		this.height=height;
		setColor(color);
	}
	public void setHeight(double height){
		this.height=height;
	}
	public double getHeight(){
		return height;
	}
	public double getVolume(){
		return (3.14*getRadius()*getRadius()*height);
	}
}