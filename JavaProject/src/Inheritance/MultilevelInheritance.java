package Inheritance;
class P
{
	int a;
	int b;
	public void display()
	{
        System.out.println(a+b);

	}
}
class Q extends P
{
	int x;
	int y;
	public void show()
	{
        System.out.println(x+y);

	}	
}
class R extends Q
{
	int p;
	int q;
	public void addition()
	{
        System.out.println(p+q);

	}	
}

public class MultilevelInheritance {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		P aobj=new P();
		aobj.a=100;
		aobj.b=200;
		aobj.display();
		
		Q bobj=new Q();
		bobj.x=10;
		bobj.y=20;
		bobj.show();
		bobj.a=150;
		bobj.b=250;
		bobj.display();
		
		R cobj=new R();
		cobj.a=100;
		cobj.b=200;
		cobj.x=300;
		cobj.y=400;
		cobj.p=500;
		cobj.q=600;
		cobj.display();
		cobj.show();
		cobj.show();


	}

}
