class Complex
{
	double real;
	double img;
	void set(double real,double img)
	{
		this.real=real;
		this.img=img;
	}
	void display(Complex c6)
	{
		if(c6.img>0)
		{
			System.out.println(c6.real+"+"+c6.img+"i");
		}
		else
		{
		System.out.print(c6.real);
		System.out.print(c6.img+"i"+"\n");
			}
	}
	void add(Complex c)
	{
		Complex temp=new Complex();
		temp.real=real+c.real;
		temp.img=img+c.img;
		this.display(temp);
		}
	void subtract(Complex c1)
	{
		Complex temp1=new Complex();
		temp1.real=real-c1.real;
		temp1.img=img-c1.img;
        this.display(temp1);
	}
	void multiply(Complex c3)
	{
		Complex temp2=new Complex();
		temp2.real=real*c3.real-img*c3.img;
		temp2.img=img*c3.real+real*c3.img;
        this.display(temp2);
}
}
public class TestComplex 
{
public static void main (String[] args) {
Complex c1=new Complex();
Complex c2=new Complex();
c1.set(-1,2);
c2.set(3,4);
c1.add(c2);
c1.subtract(c2);
c1.multiply(c2);
	}
}
