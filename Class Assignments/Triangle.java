class Triangle{
	private double hyp;
	private double perp;
	private double base;
	public double getHyp(double length,double angle){
		hyp=Math.hypot(length,angle);
		return hyp;
	}
	public double getPerp(double length, double angle){
		perp=Math.sqrt(Math.pow(hyp,2)-Math.pow(base,2));
		return perp;
	}
	public double getBase(double length, double angle){
		base=Math.sqrt(Math.pow(hyp,2)-Math.pow(perp,2));
		return base;
	}

}