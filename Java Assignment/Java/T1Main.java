import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

public class T1Main {
	public static void main(String [] args){
		Window window = new Window(20, 30, '*');
		addWindow(20,30,'*');
		
		Line line = new Line(19, 1, 29, 0, 1, '#');
		window.addShape(line);
		addLine(19, 1, 29, 0, 1, '#');
		
		line = new Line(12, 5, 6, 1, 0, '#');
		window.addShape(line);
		addLine(12, 5, 6, 1, 0, '#');
		
		Circle circle = new Circle(10,5,2,'+');
		window.addShape(circle);
		addCircle(10,5,2,'+');
		
		Rectangle rec = new Rectangle(8,16,11,10,'=');
		window.addShape(rec);
		addRectangle(8,16,11,10,'=');
		
		rec = new Rectangle(11,19,8,4,'=');
		window.addShape(rec);
		addRectangle(11,19,8,4,'=');
		
		Triangle tri = new Triangle(2,21,6,1,0,'*');
		window.addShape(tri);
		addTriangle(2,21,6,1,0,'*');
		
		Text text = new Text(2,10,"FOR SALE",1,0);
		window.addShape(text);
		addText(2,10,"FOR SALE",1,0);
		window.display();
		
	}
	
	public static void addWindow(int row, int column, char character)
	{
		try {
			PrintWriter out = new PrintWriter(new FileWriter("T1Drawing.txt", false), true);
			out.println(row+" "+column);
			out.println(character);
			out.println(".");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addLine(int row, int column, int len, int rowIncrement, int columnIncrement,char character)
	{
		try {
			PrintWriter out = new PrintWriter(new FileWriter("T1Drawing.txt", true), true);
			out.println("line");
			out.println(row+" "+column+" "+len+" "+ rowIncrement +" "+ columnIncrement);
			out.println(character);
			out.println(".");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addCircle(int row, int column, int radius,char character)
	{
		try {
			PrintWriter out = new PrintWriter(new FileWriter("T1Drawing.txt", true), true);
			out.println("circle");
			out.println(row+" "+column+" "+radius);
			out.println(character);
			out.println(".");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addRectangle(int row, int column, int height,int width, char character)
	{
		try {
			PrintWriter out = new PrintWriter(new FileWriter("T1Drawing.txt", true), true);
			out.println("rectangle");
			out.println(row+" "+column+" "+height+" "+width);
			out.println(character);
			out.println(".");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addTriangle(int row, int column, int height, int rowIncrement, int columnIncrement,char character)
	{
		try {
			PrintWriter out = new PrintWriter(new FileWriter("T1Drawing.txt", true), true);
			out.println("triangle");
			out.println(row+" "+column+" "+height+" "+ rowIncrement +" "+ columnIncrement);
			out.println(character);
			out.println(".");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void addText(int row, int column, String text,int rowIncrement, int columnIncrement)
	{
		try {
			PrintWriter out = new PrintWriter(new FileWriter("T1Drawing.txt", true), true);
			out.println("text");
			out.println(row+" "+column);
			out.println(text);
			out.println(rowIncrement+" "+columnIncrement);
			out.println(".");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
