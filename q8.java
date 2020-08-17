class MException extends Exception
{
	public MException(String s1)
	{
		super(s1);
	}
}
class GenMethod
{
	public  <E> void print(E obj1)
	{
		try
		{
		if(obj1 instanceof String)
		{
			throw new Exception("invalid argument");
		}
		else
		{
		double c=(Double.parseDouble(obj1.toString()));
		System.out.println((double)2/3*c);	
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		}
}

public class TestGenMethod {

	public static void main(String[] args) {
		
GenMethod g1=new GenMethod();
g1.print(2);
	}

}
