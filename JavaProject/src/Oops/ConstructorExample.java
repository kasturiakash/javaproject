package Oops;

public class ConstructorExample 
{
	int empid;
	String empname;
	int salary;
	int deptno;
	ConstructorExample(int id,String name,int sal,int dno) //only for initialzation,doesnt return any values
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
		ConstructorExample emp1=new ConstructorExample(101,"RAJ",20000,10); //invoked at the time of object creation
		emp1.display();
		ConstructorExample emp2=new ConstructorExample(102,"KIRAN",30000,20);
		emp2.display();
	}

}
