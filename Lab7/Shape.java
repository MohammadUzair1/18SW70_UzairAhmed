class Shape{
	private String color;
	private boolean filled;
	public Shape(){
		color="red";
		filled=true;
	}
	public Shape(String color, boolean filled){
		this.color=color;
		this.filled=filled;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setFilled(boolean filled){
		this.filled=filled;
	}
	public boolean isFilled(){
		return filled;
	}
	public String toString(){
		return "Shape[color: "+color+" filled: "+filled+"]";
	}
}
class Circle extends Shape{
	private double radius;
	public Circle(){
		radius=1.0;
	}
	public Circle(double radius){
		this.radius=radius;
	}
	public Circle(double radius, String color, boolean filled){
		this.radius=radius;
		getColor();
		isFilled();
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		return (3.14*radius*radius);
	}
	public double getPerimeter(){
		return 2*3.14*radius;
	}
	public String toString(){		
		return "Circle[Shape[color: "+getColor()+" filled: "+isFilled()+"], radius: "+radius+" Area: "+getArea()+" Perimeter: "+getPerimeter()+"]";
	}
}
class Rectangle extends Shape{
	private double width;
	private double length;
	public Rectangle(){
		width=1.0;
		length=1.0;
	}
	public Rectangle(double width, double length){
		this.width=width;
		this.length=length;
	}
	public Rectangle(double width, double length, String color, boolean filled){
	this.width=width;
	this.length=length;
	getColor();
	isFilled();
	}
	public void setWidth(double width){
		this.width=width;
	}
	public double getWidth(){
		return width;
	}
	public void setLength(double length){
		this.length=length;
	}
	public double getLength(){
		return length;
	}
	public double getArea(){
		return width*length;
	}
	public double getPerimeter(){
		return 2*(length+width);
	}
	public String toString(){		
		return "Rectangle[Shape[color: "+getColor()+"filled: "+isFilled()+"], width: "+width+" length: "+length+" Area: "+getArea()+" Perimeter: "+getPerimeter()+"]";
	}
}
class Square extends Rectangle{
	private double side;
	public Square(){

	}
	public Square(double side){
		this.side=side;
	}
	public Square(double side, String color, boolean filled){
		this.side=side;
		getColor();
		isFilled();
	}
	public void setSide(double side){
		this.side=side;
	}
	public double getSide(){
		return side;
	}
	public void setWidth(double side){
		this.side=side;
	}
	public void setLength(double side){
		this.side=side;
	}
	public String toString(){
		return "Square[Rectangle[ Width: "+side+" Length: "+side+"]]";
	}
}