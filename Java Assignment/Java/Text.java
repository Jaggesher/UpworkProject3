import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Text extends Shape {
	int rowBase;
	int colBase;
	String text;
	int rowIncrement;
	int colIncrement;

	Text(int rowBase, int colBase, String text, int rowIncrement, int colIncrement) {
		this.rowBase = rowBase;
		this.colBase = colBase;
		this.text = text;
		this.rowIncrement = rowIncrement;
		this.colIncrement = colIncrement;

	}

	public void draw(Window window) {
		char win[][];
		win = window.win;

		int length = text.length();
		// System.out.println(rows);
		// System.out.println(cols);
		int newRow = rowBase;
		int newCol = colBase;

		for (int i = 0; i < length; i++) {
			
			win[newRow][newCol] = text.charAt(i);
			newRow += rowIncrement;
			newCol += colIncrement;

		}

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This program does not support Text");
	}

	@Override
	public void changeShape(char action) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeToFile(String fileName) {
		// TODO Auto-generated method stub

		try {
			PrintWriter out = new PrintWriter(new FileWriter(fileName, true), true);
			out.println("text");
			out.println(rowBase + " " + colBase);
			out.println(text);
			out.println(rowIncrement + " " + colIncrement);
			out.println(".");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
