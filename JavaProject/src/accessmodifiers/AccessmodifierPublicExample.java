package accessmodifiers;
class A
{
	private int i=10;
	private void m1()
	{
		System.out.println(i);
	}
}

public class AccessmodifierPublicExample {

	public static void main(String[] args) 
	{
		A aobj=new A();
		aobj.i=10; //cannot access since it is private
		aobj.m1()

	}

}
