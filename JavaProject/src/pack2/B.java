package pack2;

import pack1.A;

public class B extends A {

	public static void main(String[] args)
	{
		//A aobj=new A(); //default
		B aobj=new B(); //protected
		aobj.i=20;
		aobj.m1();
	}

}
