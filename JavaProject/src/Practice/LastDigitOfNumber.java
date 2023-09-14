package Practice;

public class LastDigitOfNumber {
	int num;
	int m1()
	{
		return(num%10);
	}

	public static void main(String[] args) 
	{
		LastDigitOfNumber last=new LastDigitOfNumber();
		last.num=2056;
		int lastno=last.m1();
		System.out.println("The lastno is "+lastno);

	}

}
