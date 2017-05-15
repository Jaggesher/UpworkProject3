import java.io.IOException;

public class T2Main {

	public static void main(String[] args) throws IOException {
		Window window = Window.readSpecFromFile("T1Drawing.txt");
		window.display();
	}

}
