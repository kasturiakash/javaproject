package Overloading;

public class ConstructorOverloading
{
	int a=0;
	int b=0;
	double c=0;
	ConstructorOverloading() //default constructor
	{
		a=10;
		b=20;
		c=20.5;
		
	}
	ConstructorOverloading(int x,int y) //parametrized constructor
	{
		a=x;
		b=y;
	}
	ConstructorOverloading(int x,double y)
	{
		a=x;
		c=y;
	}
	ConstructorOverloading(int x,int y,double z)
	{
		a=x;
		b=y;
		c=z;
	}
	ConstructorOverloading(int x,double y,int z)
	{
		a=x;
		b=z;
		c=y;
	}
	void display()
	{
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

	}
	public static void main(String[] args)
	{
		//ConstructorOverloading c=new ConstructorOverloading();
		//ConstructorOverloading c=new ConstructorOverload`ing(10,20);
		//ConstructorOverloading c=new ConstructorOverloading(10,20.5);
		//ConstructorOverloading c=new ConstructorOverloading(10,20,20.5);
		ConstructorOverloading c=new ConstructorOverloading(10,20.5,20);
		c.display();

	}

}
