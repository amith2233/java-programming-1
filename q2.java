

import java.util.Scanner;

class Rectangle
{
	int width;
	int height;
	void display()
	{
		System.out.println("width: "+width+" "+"height: "+height);
	}
}
class RectangleArea extends Rectangle
{
	void read_input()
	{
		Scanner sc=new Scanner(System.in);
		width=sc.nextInt();
		height=sc.nextInt();
		sc.close();
	}
	void display()
	{
		super.display();
		System.out.println("area is: "+(width*height));
	}
}
public class TestRectangle {

	public static void main(String[] args) {
		RectangleArea r1=new RectangleArea();
		r1.read_input();
		r1.display();
		
	}

}
