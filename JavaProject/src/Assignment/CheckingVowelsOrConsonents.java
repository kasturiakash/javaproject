package Assignment;

import java.util.Scanner;

public class CheckingVowelsOrConsonents {

	public static void main(String[] args) 
	{
		char input;
		System.out.println("Enter any character");
		Scanner scan=new Scanner(System.in);
		input=scan.next().charAt(0);
		if( input=='a'||input=='e'||input=='i'||input=='o'||input=='u'||input=='A'||input=='E'||input=='I'||input=='O'||input=='U')
		{
			System.out.println("given input is vowel");
		}
		else
		{
			System.out.println("given input is consonent");

		}

	}

}
