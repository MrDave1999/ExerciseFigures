import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.List;
import java.lang.Exception;

class IOText
{
	public static void saveTxt(List<Figure> listfig)
	{
		try(var buff = new BufferedWriter(new FileWriter("figuras.txt")))
		{
			
			if(listfig.size() > 0)
			{
				for(Figure fig : listfig)
				{
					buff.write(fig.toString());
					buff.newLine();
				}
			}
			else
				System.out.println("No hay figuras disponibles");
		}
		catch(Exception e)
		{
		}
	}
	
	public static void readTxt()
	{
		String dat;
		try(var buff = new BufferedReader(new FileReader("figuras.txt")))
		{
			while((dat = buff.readLine()) != null)
			{
				System.out.println(dat);
			}
		}
		catch(Exception e)
		{
		}
	}
}
