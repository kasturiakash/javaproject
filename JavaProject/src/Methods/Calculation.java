package Methods;

public class Calculation 
{
	int a;
	int b;
	//method not takes parameters
	void sum()
	{
		System.out.println(a+b);

	}
	//method  takes parameters
	void add(int a,int b)
	{
		int x=a; //this concept
		int y=b;
		System.out.println(x+y);	
	}
	//method  return values
	int addition()
	{
		return(a+b);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Calculation cal=new Calculation();
		cal.a=100;
		cal.b=200;
		cal.sum();
		cal.add(100, 200);
		int r=cal.addition();
		System.out.println(r);	
		

	}

}
