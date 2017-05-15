
public class T1Main {
	public static void main(String[] args) {
		String fileName = "T1Drawing.txt";
		Window window = new Window(20, 30, '*');
		window.writeToFile(fileName);

		Line line = new Line(19, 1, 29, 0, 1, '#');
		window.addShape(line);
		line.writeToFile(fileName);

		line = new Line(12, 5, 6, 1, 0, '#');
		window.addShape(line);
		line.writeToFile(fileName);

		Circle circle = new Circle(10, 5, 2, '+');
		window.addShape(circle);
		circle.writeToFile(fileName);

		Rectangle rec = new Rectangle(8, 16, 11, 10, '=');
		window.addShape(rec);
		rec.writeToFile(fileName);;

		rec = new Rectangle(11, 19, 8, 4, '=');
		window.addShape(rec);
		rec.writeToFile(fileName);

		Triangle tri = new Triangle(2, 21, 6, 1, 0, '*');
		window.addShape(tri);
		tri.writeToFile(fileName);

		Text text = new Text(2, 10, "FOR SALE", 1, 0);
		window.addShape(text);
		text.writeToFile(fileName);
		
		window.display();

	}
}
