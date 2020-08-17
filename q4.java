class Circle
{
	
	private double radius=1.0;
	private String color="red";
	Circle()
	{
		
	}
	Circle(double r)
	{
		radius=r;
	}
	double getRadius()
	{
		return radius;
	}
	double getArea()
	{
		return 3.14*radius*radius;
	}
	String color()
	{
		return color;
	}
	
}
public class CircleArea {

	public static void main(String[] args) {
		
Circle c1=new Circle(2.5);
System.out.println("radius of circle: "+c1.getRadius());
System.out.println("area of circle is: "+c1.getArea());
System.out.println("color is: "+c1.color());
	}

}
