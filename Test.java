import java.util.List;
import java.util.ArrayList;

class Test
{
	public static void main(String[] args)
	{
		List<Figure> listfig = new ArrayList<>();
		
		listfig.add(new Triangle(23, 26));
		listfig.add(new Rectangle(5, 5));
		listfig.add(new Circle(2));
		listfig.add(new Circle(6));
		IOText.saveTxt(listfig);
		IOText.readTxt();
		IOBin.saveBin(listfig);
		IOBin.readBin();
	}
}
