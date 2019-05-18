class TriangleMainClass{
	public static void main(String[] args) {
		Triangle x=new Triangle();
		System.out.println("Hypotenuse= "+x.getHyp(5,3));
		System.out.println("Perpendicular= "+x.getPerp(2,4));
		System.out.println("Base= "+x.getBase(1,2));

	}
}