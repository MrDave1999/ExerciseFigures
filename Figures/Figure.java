import java.io.Serializable;

abstract class Figure implements Serializable
{
	private String nameFigure = getClass().getSimpleName();
	
	public String getNameFigure()
	{
		return nameFigure;
	}
	
	abstract double calculateArea();//Method calculateArea
	
	@Override
	public String toString()
	{
		return "Nombre figura: " + nameFigure + " Area: " + calculateArea();
	}
}
