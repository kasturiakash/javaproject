package Oops;

public class Object
{
	int empid;
	String empname;
	int salary;
	int deptno;
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
		Object emp1=new Object();
		emp1.empid=101;
		emp1.empname="ramesh";
		emp1.salary=20000;
		emp1.deptno=10;
		emp1.display();
		Object emp2=new Object();
		emp2.empid=102;
		emp2.empname="suresh";
		emp2.salary=30000;
		emp2.deptno=20;
		emp2.display();


	}

}


