
class Rectangle extends Figure
{
	private double base;
	private double height;
	
	public Rectangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	public double getBase()
	{
		return base;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	@Override
	public double calculateArea()
	{
		return base*height;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " Dimensiones: " + base + " y " + height;
	}
}
