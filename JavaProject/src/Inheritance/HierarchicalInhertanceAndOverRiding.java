package Inheritance;
class Bank
{
	int getRateofinterest()
	{
		return 0; 
	}
}
class SBI extends Bank
{
	int getRateofinterest()
	{
		return 10; 
	}
}
class ICICI extends Bank
{
	int getRateofinterest()
	{
		return 15; 
	}
}
class AXIS extends Bank
{
	int getRateofinterest()
	{
		return 12; 
	}
}


public class HierarchicalInhertanceAndOverRiding {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SBI sbiobj=new SBI();
        System.out.println(sbiobj.getRateofinterest());
		ICICI iciciobj=new ICICI();
        System.out.println(iciciobj.getRateofinterest());
		AXIS axisobj=new AXIS();
        System.out.println(axisobj.getRateofinterest());


	}

}
