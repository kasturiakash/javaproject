package Stringmethods;

public class Stringmethods {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="welcome";
		System.out.println(s.length()); //length
		String s1="welcome to";
		String s2="project";
		//conctenation
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println("welcome to"+"project");
		//equals
		String s3="WELCOME";
		String s4="welcome";
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3.equals(s4));
		System.out.println(s3.contains("xyz"));
		System.out.println(s3.contains("WEL"));
		//substring
		System.out.println(s.substring(0,3));
		System.out.println(s.substring(2,5));
		System.out.println(s.replace('e','d'));
		System.out.println(s.replace("come","kame"));
		


		



		

	}

}
