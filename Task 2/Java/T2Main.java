
public class T2Main {
	
	private String fileName;
	
	public T2Main(String fileName)
	{
		this.fileName = fileName;
	}
	
	public void displayDrawing()
	{
		Window window = Window.readSpecFromFile(fileName);
		window.display();
	}

}
