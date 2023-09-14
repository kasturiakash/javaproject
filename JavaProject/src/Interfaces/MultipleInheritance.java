package Interfaces;
interface A
{
	int a=10;
	void display();
}
interface B
{
	int b=20;
	void show();
}

public class MultipleInheritance implements A,B
{
	public void display()
	{
        System.out.println(a);

	}
	public void show()
	{
        System.out.println(b);

	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MultipleInheritance m1=new MultipleInheritance();
		m1.display();
		m1.show();

	}

}

