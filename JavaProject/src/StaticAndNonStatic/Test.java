package StaticAndNonStatic;

public class Test 
{
	int a; //non static
	static int b;
	static void m1()
	{
        System.out.println("this m1 is static");
	}
	void m2()
	{
        System.out.println("this m2 is non static");
	}
	void m3()
	{
		a=500;
		b=1000;
		m1();
		m2();
	}
	

	public static void main(String[] args)
	{
		Test t=new Test();
		t.a=200;
        System.out.println(t.a);
        t.m2();
        
        b=100;
        System.out.println(b);
        m1();
		
	}

}
