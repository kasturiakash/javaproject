package Practice;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) 
	{
		int a=20;
		int b=40;
		int c=60;
		int max;
		int great;
		max=(a>b&&a>c)?a:((b>a&&b>c)?b:c); //ternery operator
		System.out.println(max+" is greatest");
		
		
		
	}

}
