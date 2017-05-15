
public class Rectangle extends Shape
{
	int rowBase;
	int colBase;
	int height;
	int width;
	char drawingCharacter;

	Rectangle(int rowBase, int colBase, int height, int width, char drawingCharacter){	
		this.rowBase = rowBase;
		this.colBase = colBase;
		this.height = height;
		this.width = width;
		this.drawingCharacter = drawingCharacter;


	}

	public void draw(Window window){
		char win[][];
		win = window.win;
		int rows = win.length;
		int cols = win[0].length;  // assuming rows >= 1
		//System.out.println(rows);
		//System.out.println(cols);
		int newRow=rowBase;
		int newCol=colBase;

		for(int i=0;i<=height;i++){
			//System.out.println(newRow + " " + colBase);
			win[newRow][colBase]=drawingCharacter;
			win[newRow][colBase+width]=drawingCharacter;
			newRow += 1;
			
			}

		for(int i=0;i<=width;i++){

			win[rowBase][newCol]=drawingCharacter;
			win[rowBase+height][newCol]=drawingCharacter;
			newCol += 1;
			
			}

		
				//System.out.println();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This program does not support Rectangle");
	}

	@Override
	public void changeShape(char action) {
		// TODO Auto-generated method stub
		
	}
}

