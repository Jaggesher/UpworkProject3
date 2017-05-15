import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Line extends Shape {
	int rowBase;
	int colBase;
	int length;
	int rowIncrement;
	int colIncrement;
	char drawingCharacter;

	Line(int rowBase, int colBase, int length, int rowIncrement, int colIncrement, char drawingCharacter) {
		this.rowBase = rowBase;
		this.colBase = colBase;
		this.length = length;
		this.rowIncrement = rowIncrement;
		this.colIncrement = colIncrement;
		this.drawingCharacter = drawingCharacter;

	}

	public void draw(Window window) {
		char win[][];
		win = window.win;
		int rows = win.length;
		int cols = win[0].length; // assuming rows >= 1
		// System.out.println(rows);
		// System.out.println(cols);
		int newRow = rowBase;
		int newCol = colBase;

		for (int i = 0; i <= length; i++) {

			win[newRow][newCol] = drawingCharacter;
			newRow += rowIncrement;
			newCol += colIncrement;

		}
		// System.out.println();

	}

	public void display() {
		System.out.println("line(" + rowBase + "," + colBase + ")(" + length + ")(" + rowIncrement + ',' + colIncrement
				+ ")(" + drawingCharacter + ')');
	}

	@Override
	public void changeShape(char action) {
		// TODO Auto-generated method stub
		if (action == 'u')
			rowBase--;
		else if (action == 'd')
			rowBase++;
		else if (action == 'l')
			colBase--;
		else if (action == 'r')
			colBase++;
		else if (action == '+')
			length++;
		else if (action == '-')
			length--;

	}

	@Override
	public void writeToFile(String fileName) {
		// TODO Auto-generated method stub

		try {
			PrintWriter out = new PrintWriter(new FileWriter(fileName, true), true);
			out.println("line");
			out.println(rowBase + " " + colBase + " " + length + " " + rowIncrement + " " + colIncrement);
			out.println(drawingCharacter);
			out.println(".");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
