package Oops;

public class Methods
{
	int empid;
	String empname;
	int salary;
	int deptno;
	void setdata(int id,String name,int sal,int dno)
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
	}
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);

	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Methods emp1=new Methods();
		emp1.setdata(101,"Raj",20000,10);
		emp1.display();
		Methods emp2=new Methods();
		emp2.setdata(102,"Kiran",30000,20);
		emp2.display();

	}

}
