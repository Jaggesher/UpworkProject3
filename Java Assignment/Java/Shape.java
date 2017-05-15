public abstract class Shape

{

	// public int rowBase,colBase;

	// public Shape(int rowBase,int colBase)
	// {
	// this.rowBase=rowBase;
	// this.colBase=colBase;
	// }

	// public int getRowBase()
	// {
	// return rowBase;
	// }

	// public int getColBase()
	// {
	// return colBase;
	// }

	public abstract void draw(Window window);

	public abstract void display();

	public abstract void changeShape(char action);

	public abstract void writeToFile(String fileName);
}
