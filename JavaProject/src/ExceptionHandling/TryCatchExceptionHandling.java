package ExceptionHandling;

public class TryCatchExceptionHandling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=20;
		try
		{
		System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		String s=null; 
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		int arr[]=new int[5];
		try
		{
		arr[10]=100;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("this is final");

		}
	}

}
