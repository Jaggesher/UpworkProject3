

public class Triangle extends Shape
{
	int rowBase;
	int colBase;
	int height;
	int rowIncrement;
	int colIncrement;
	char drawingCharacter;

	Triangle(int rowBase, int colBase, int height, int rowIncrement, int colIncrement, char drawingCharacter){
		this.rowBase = rowBase;
		this.colBase = colBase;
		this.height = height;
		this.rowIncrement = rowIncrement;
		this.colIncrement = colIncrement;
		this.drawingCharacter = drawingCharacter;


	}

	public void draw(Window window){
		char win[][];
		win = window.win;
		int p1Row,p1Col,p2Row,p2Col;
		int newRow=rowBase;
		int newCol=colBase;

		if (rowIncrement==0&&colIncrement==1){
			for(int i=0;i<=height;i++){
				p1Row = rowBase + i*(int)Math.round(1.0/Math.cos(Math.toRadians(45)));
				p1Col = colBase + i*(int)Math.round(1.0/Math.sin(Math.toRadians(45)));
				p2Row = rowBase - i*(int)Math.round(1.0/Math.cos(Math.toRadians(45)));
				p2Col = colBase + i*(int)Math.round(1.0/Math.sin(Math.toRadians(45)));
				
				//newRow = rowBase + rowIncrement + i*(int)Math.round(1.0/Math.cos(Math.toRadians(45)));
				//newCol = colBase + colIncrement + i*(int)Math.round(1.0/Math.sin(Math.toRadians(45)));
				
				//win[newRow][colBase]=drawingCharacter;
				win[p1Row][p1Col]=drawingCharacter;
				win[p2Row][p2Col]=drawingCharacter;

				win[p1Row][colBase+height]=drawingCharacter;
				win[p2Row][colBase+height]=drawingCharacter;
					
			
			}

		}
		else if (rowIncrement==0&&colIncrement==-1){
			for(int i=0;i<=height;i++){
				p1Row = rowBase + i*(int)Math.round(1.0/Math.cos(Math.toRadians(45)));
				p1Col = colBase - i*(int)Math.round(1.0/Math.sin(Math.toRadians(45)));
				p2Row = rowBase - i*(int)Math.round(1.0/Math.cos(Math.toRadians(45)));
				p2Col = colBase - i*(int)Math.round(1.0/Math.sin(Math.toRadians(45)));
				
				//newRow = rowBase + rowIncrement + i*(int)Math.round(1.0/Math.cos(Math.toRadians(45)));
				//newCol = colBase + colIncrement + i*(int)Math.round(1.0/Math.sin(Math.toRadians(45)));
				
				//win[newRow][colBase]=drawingCharacter;
				win[p1Row][p1Col]=drawingCharacter;
				win[p2Row][p2Col]=drawingCharacter;
				win[p1Row][colBase+height]=drawingCharacter;
				win[p2Row][colBase+height]=drawingCharacter;
			
			}

		}
		else if (rowIncrement==-1&&colIncrement==0){
			for(int i=0;i<=height;i++){
				p1Row = rowBase - i*(int)Math.round(1.0/Math.cos(Math.toRadians(45)));
				p1Col = colBase + i*(int)Math.round(1.0/Math.sin(Math.toRadians(45)));
				p2Row = rowBase - i*(int)Math.round(1.0/Math.cos(Math.toRadians(45)));
				p2Col = colBase - i*(int)Math.round(1.0/Math.sin(Math.toRadians(45)));
				
				//newRow = rowBase + rowIncrement + i*(int)Math.round(1.0/Math.cos(Math.toRadians(45)));
				//newCol = colBase + colIncrement + i*(int)Math.round(1.0/Math.sin(Math.toRadians(45)));
				
				//win[newRow][colBase]=drawingCharacter;
				win[p1Row][p1Col]=drawingCharacter;
				win[p2Row][p2Col]=drawingCharacter;
				win[rowBase+height][p1Col]=drawingCharacter;
				win[rowBase+height][p2Col]=drawingCharacter;
			
			}

		}
		else if (rowIncrement==1&&colIncrement==0){
			for(int i=0;i<=height;i++){
				p1Row = rowBase + i*(int)Math.round(1.0/Math.cos(Math.toRadians(45)));
				p1Col = colBase + i*(int)Math.round(1.0/Math.sin(Math.toRadians(45)));
				p2Row = rowBase + i*(int)Math.round(1.0/Math.cos(Math.toRadians(45)));
				p2Col = colBase - i*(int)Math.round(1.0/Math.sin(Math.toRadians(45)));
				
				//newRow = rowBase + rowIncrement + i*(int)Math.round(1.0/Math.cos(Math.toRadians(45)));
				//newCol = colBase + colIncrement + i*(int)Math.round(1.0/Math.sin(Math.toRadians(45)));
				
				//win[newRow][colBase]=drawingCharacter;
				win[p1Row][p1Col]=drawingCharacter;
				win[p2Row][p2Col]=drawingCharacter;

				win[rowBase+height][p1Col]=drawingCharacter;
				win[rowBase+height][p2Col]=drawingCharacter;
			
			}

		}
		


	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This program does not support Triangle");
	}
}



