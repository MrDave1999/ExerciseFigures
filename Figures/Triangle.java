class Triangle extends Figure
{
	private Rectangle rec;
	public Triangle(double base, double height)
	{
		rec = new Rectangle(base, height);
	}
	
	public Rectangle getDim()
	{
		return rec;
	}
	
	@Override
	public double calculateArea()
	{
		return rec.calculateArea() / 2;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " Dimensiones: " + rec.getBase() + "x" + rec.getHeight();
	}
}
