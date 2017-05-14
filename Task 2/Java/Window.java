import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Window

{
	public int numberOfRows, numberOfColumns;
	public char borderCharacter;
	public char win[][];
	ArrayList<Shape> items;

	public Window(int numberOfRows, int numberOfColumns, char borderCharacter) {
		this.numberOfRows = numberOfRows;
		this.numberOfColumns = numberOfColumns;
		this.borderCharacter = borderCharacter;
		this.win = new char[numberOfRows + 2][numberOfColumns + 2];
		for (int i = 0; i <= numberOfRows + 1; i++) {
			for (int j = 0; j <= numberOfColumns + 1; j++) {
				if (i == 0 || j == 0 || i == numberOfRows + 1 || j == numberOfColumns + 1)
					win[i][j] = borderCharacter;
				else
					win[i][j] = ' ';
			}
		}

		items = new ArrayList<Shape>();
	}

	public void addShape(Shape shape) {
		// shape.draw(this);
		items.add(shape);
	}

	public void removeShape(Shape shape) {

	}

	void display() {
		Iterator itr = items.iterator();
		while (itr.hasNext()) {
			((Shape) itr.next()).draw(this);
		}
		for (int i = 0; i <= numberOfRows + 1; i++) {
			for (int j = 0; j <= numberOfColumns + 1; j++) {
				System.out.print(win[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static Window readSpecFromFile(String fileName) {
		Window window = null;

		int tempNumberOfRows, tempNnumberOfColumns;
		char tempChar;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));

			// At first there will be the row and column number in file
			String tempString[] = reader.readLine().split(" ");
			tempNumberOfRows = Integer.parseInt(tempString[0]);
			tempNnumberOfColumns = Integer.parseInt(tempString[1]);

			tempChar = reader.readLine().charAt(0);

			window = new Window(tempNumberOfRows, tempNnumberOfColumns, tempChar);
			tempChar = reader.readLine().charAt(0);

			// reading file until the end
			String type;
			while ((type = reader.readLine()) != null) {

				String input[] = null;
				// line will be added in the window
				if (type.equals("line")) {

					input = reader.readLine().split(" ");

					int rowBase = Integer.parseInt(input[0]);
					int colBase = Integer.parseInt(input[1]);
					int length = Integer.parseInt(input[2]);
					int rowIncrement = Integer.parseInt(input[3]);
					int colIncrement = Integer.parseInt(input[4]);
					tempChar = reader.readLine().charAt(0);

					Line line = new Line(rowBase, colBase, length, rowIncrement, colIncrement, tempChar);

					window.addShape(line);

					// reading the "."
					tempChar = reader.readLine().charAt(0);

				}

				else if (type.equals("circle")) {

					input = reader.readLine().split(" ");

					int rowBase = Integer.parseInt(input[0]);
					int colBase = Integer.parseInt(input[1]);
					int radius = Integer.parseInt(input[2]);
					tempChar = reader.readLine().charAt(0);

					Circle circle = new Circle(rowBase, colBase, radius, tempChar);

					window.addShape(circle);

					// reading the "."
					tempChar = reader.readLine().charAt(0);
				}

				else if (type.equals("rectangle")) {

					input = reader.readLine().split(" ");

					int rowBase = Integer.parseInt(input[0]);
					int colBase = Integer.parseInt(input[1]);
					int height = Integer.parseInt(input[2]);
					int width = Integer.parseInt(input[3]);
					tempChar = reader.readLine().charAt(0);

					Rectangle rectangle = new Rectangle(rowBase, colBase, height, width, tempChar);

					window.addShape(rectangle);

					// reading the "."
					tempChar = reader.readLine().charAt(0);
				}

				else if (type.equals("triangle")) {

					input = reader.readLine().split(" ");

					int rowBase = Integer.parseInt(input[0]);
					int colBase = Integer.parseInt(input[1]);
					int height = Integer.parseInt(input[2]);
					int rowIncrement = Integer.parseInt(input[3]);
					int colIncrement = Integer.parseInt(input[4]);
					tempChar = reader.readLine().charAt(0);

					Triangle triangle = new Triangle(rowBase, colBase, height, rowIncrement, colIncrement, tempChar);

					window.addShape(triangle);

					// reading the "."
					tempChar = reader.readLine().charAt(0);
				}
				
				/*else if (type.equals("text")) {

					input = reader.readLine().split(" ");

					int rowBase = Integer.parseInt(input[0]);
					int colBase = Integer.parseInt(input[1]);
					int height = Integer.parseInt(input[2]);
					int rowIncrement = Integer.parseInt(input[3]);
					int colIncrement = Integer.parseInt(input[4]);
					tempChar = reader.readLine().charAt(0);

					Triangle triangle = new Triangle(rowBase, colBase, height, rowIncrement, colIncrement, tempChar);

					window.addShape(triangle);

					// reading the "."
					tempChar = reader.readLine().charAt(0);
				}*/

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return window;
	}

}
