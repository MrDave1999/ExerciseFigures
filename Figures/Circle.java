import java.lang.Math;

class Circle extends Figure
{
	private double radio;
	
	public Circle(double radio)
	{
		this.radio = radio;
	}
	
	public double getRadio()
	{
		return radio;
	}
	
	@Override
	public double calculateArea()
	{
		return Math.PI* radio* radio;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " Dimensiones: " + radio + "x" + radio;
	}
}
