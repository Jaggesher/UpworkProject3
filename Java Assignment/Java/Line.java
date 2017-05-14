public class Line extends Shape
{
	int rowBase;
	int colBase;
	int length;
	int rowIncrement;
	int colIncrement;
	char drawingCharacter;

	Line(int rowBase, int colBase, int length, int rowIncrement, int colIncrement, char drawingCharacter){	
		this.rowBase = rowBase;
		this.colBase = colBase;
		this.length = length;
		this.rowIncrement = rowIncrement;
		this.colIncrement = colIncrement;
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

		for(int i=0;i<=length;i++){

			win[newRow][newCol]=drawingCharacter;
			newRow += rowIncrement;
			newCol += colIncrement;
			
			}
				//System.out.println();

	}
}
