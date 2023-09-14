package ExceptionHandling;

public class UncheckedExceptionExamples {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=20;
		System.out.println(a/0); //ArithmeticException
		String s=null; 
		System.out.println(s.length()); //null pointer exception
		String st="abcdef";
		int i=Integer.parseInt(st);
		System.out.println(i); //numberformat exception
		int arr[]=new int[5];
		arr[10]=100; //array out of bound exception
	}

}
