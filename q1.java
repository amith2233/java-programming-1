class Calculator
{
	interface Add
	{
		double add(double a,double b);
	}
	interface Difference
	{
		double difference(double a,double b);
	}
	interface Product
	{
		double product(double a,double b);
	}
	interface SafeDivision
	{
		void safeDivision(double a,double b);
	}
}
class TestCalculator {

	public static void main(String[] args) {
		
Calculator.Add a1=(a,b)->a+b;
Calculator.Difference a2=(a,b)->a-b;
Calculator.Product a3=(a,b)->a*b;
Calculator.SafeDivision a4=(a,b)->
{
	try
	{
		if(b==0)
		{
		throw new Exception();
		}

		else
		{
			double c=a/b;
			System.out.println(c);
		}
	}
	catch(Exception e)
	{
		System.out.println("divide by zero error");
	}
};
System.out.println(a1.add(2.5,3.5));
System.out.println(a2.difference(3.2,5.2));
System.out.println(a3.product(5.3,6.2));
a4.safeDivision(5,0);

	}

}
