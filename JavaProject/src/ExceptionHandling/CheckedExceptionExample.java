package ExceptionHandling;

public class CheckedExceptionExample 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("start");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");


	}

}
