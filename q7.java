import java.util.Scanner;
import java.lang.Math; 
class Triangle
{
	
	double area(double a,double b,double c)
	{
		double s=(a+b+c)/2;
		double a1=s*(s-a)*(s-b)*(s-c);
		double area=Math.pow(a1,0.5);
		return area;
	}
}
public class TriangleArea {

	public static void main(String[] args) {
		
Triangle t1=new Triangle();
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
double area1=t1.area(a,b,c);
System.out.println("area of triangle is: "+area1);
sc.close();
	}

}
