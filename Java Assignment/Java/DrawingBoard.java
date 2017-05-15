import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DrawingBoard {
	static Window window;
	static int select = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName;
		System.out.println("Enter the window file name (or NEW):");
		//BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		fileName = scanner.nextLine();
		//System.out.println(fileName);
		if(fileName.equals("NEW"))
		{
			int row, column;
			char character;
			row = scanner.nextInt();
			column = scanner.nextInt();
			character = scanner.next().charAt(0);
			//System.out.println(character);
			window = new Window(row,column,character);
			window.addGrid();
			window.display();
			menu();
		}
		else
		{
			window = Window.readSpecFromFile(fileName);
			window.addGrid();
			window.display();
			menu();
		}
	}
	

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("Add Erase Select Write Quit");
		System.out.println("Up Down Left Right + -");
		char input;
		Scanner scanner = new Scanner(System.in);
		input = scanner.next().charAt(0);
		if(input == 'a')
		{
			System.out.println("circle rowBase colBase radius character");
			System.out.println("line rowBase colBase length rowIncrement colIncrement character");
			String type;
			type = scanner.next();
			//System.out.println(input);
			int rowBase ,colBase, length ,rowIncrement,colIncrement ,radious;
			char character;
			if(type.equals("line"))
			{
				rowBase = scanner.nextInt();
				colBase = scanner.nextInt();
				length = scanner.nextInt();
				rowIncrement = scanner.nextInt();
				colIncrement = scanner.nextInt();
				character = scanner.next().charAt(0);
//				System.out.println(rowBase);
//				System.out.println(colBase);
//				System.out.println(length);
//				System.out.println(rowIncrement);
//				System.out.println(colIncrement);
//				System.out.println(character);
				Line line = new Line(rowBase, colBase, length, rowIncrement, colIncrement, character);
				window.addShape(line);
				window.display();
				menu();
			}
		}
		else if(input == 'e')
		{
			Iterator itr = window.items.iterator();
			int count = 0;
			while (itr.hasNext()) {
				System.out.print(count+": ");
				((Shape) itr.next()).display();
				count++;
			}
			
			int temp = scanner.nextInt();
			if(temp < count)
			{
				//System.out.println(window.items.size());
				window.items.remove(temp);
				window.refreshImage();
				window.display();
			}
			else {
				System.out.println("Please give correct index number");
			}
			menu();
		}
		else if(input == 's')
		{
			Iterator itr = window.items.iterator();
			int count = 0;
			while (itr.hasNext()) {
				System.out.print(count+": ");
				((Shape) itr.next()).display();
				count++;
			}
			select = scanner.nextInt();
			window.refreshImage();
			window.display();
			menu();
		}
		else if(input == 'u' || input=='d' || input=='l' || input=='r')
		{
			if(select == Integer.MAX_VALUE)
				System.out.println("Please Select First");
			else{
				window.items.get(select).changeShape(input);
				window.refreshImage();
				window.display();
			}
			menu();
		}
	}

}
