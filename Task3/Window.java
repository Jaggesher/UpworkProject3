import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
 
public class Window
 
{
	public int numberOfRows,numberOfColumns;
	public char borderCharacter;
	public char win[][];
 	ArrayList<Shape> items;
   
public Window(int numberOfRows,int numberOfColumns,char borderCharacter){
 	this.numberOfRows=numberOfRows;
	this.numberOfColumns=numberOfColumns;
	this.borderCharacter=borderCharacter;
	this.win = new char[numberOfRows+2][numberOfColumns+2];
	for(int i=0;i<=numberOfRows+1;i++)
		{
			for(int j=0;j<=numberOfColumns+1;j++)
			{
				if(i==0||j==0||i==numberOfRows+1||j==numberOfColumns+1)
				win[i][j]=borderCharacter;
				else
					win[i][j]=' ';
			}
		}

	items = new ArrayList<Shape>();
   }
 


public void addShape(Shape shape){
	//shape.draw(this);
	items.add(shape);
}

   
public void removeShape(Shape shape){
   
}
    
void display(){
	Iterator itr=items.iterator();  
		while(itr.hasNext()){ 
		((Shape)itr.next()).draw(this);
		}
    for(int i=0;i<=numberOfRows+1;i++)
		{
		for(int j=0;j<=numberOfColumns+1;j++){
			System.out.print(win[i][j] + " ");
			}

		System.out.println();
		}
    }

}


