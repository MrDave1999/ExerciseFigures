import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Exception;
import java.util.List;
import java.util.ArrayList;

class IOBin
{
	public static void saveBin(List<Figure> listfig)
	{
		try(var ob = new ObjectOutputStream(new FileOutputStream("datos.dat")))
		{
			for(Figure f : listfig)
				ob.writeObject(f);		
		}
		catch(Exception e)
		{
		}
	}
	
	public static void readBin()
	{
		List<Figure> listfig = null;
		try(var ob = new ObjectInputStream(new FileInputStream("datos.dat")))
		{
			listfig = new ArrayList<>();
			while(true)
			{
				listfig.add((Figure) ob.readObject());
			}
		}
		catch(Exception e)
		{
		}
		if(listfig != null)
		{
			for(Figure fig : listfig)
				System.out.println(fig.toString());
		}
	}
}
