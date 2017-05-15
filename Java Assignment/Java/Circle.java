

public class Circle extends Shape
{
	int rowBase;
	int colBase;
	int radius;
	char drawingCharacter;

	Circle(int rowBase, int colBase, int radius, char drawingCharacter){
		this.rowBase = rowBase;
		this.colBase = colBase;
		this.radius = radius;
		this.drawingCharacter = drawingCharacter;

	}

	public void draw(Window window){
		char win[][];
		win = window.win;
		//System.out.println(rows);
		//System.out.println(cols);
		int newRow=rowBase;
		int newCol=colBase;

		for(int i=0;i<=360;i+=18){
			//System.out.println(i);
			newRow = rowBase + (int)Math.round(radius*Math.cos(Math.toRadians(i)));
			newCol = colBase + (int)Math.round(radius*Math.sin(Math.toRadians(i)));
			win[newRow][newCol]=drawingCharacter;
			}

		
				//System.out.println();

	}

	@Override
	public void display()
	{
		System.out.println("circle("+rowBase+","+colBase+")("+radius+")("+drawingCharacter+')');
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
		
	}
}



