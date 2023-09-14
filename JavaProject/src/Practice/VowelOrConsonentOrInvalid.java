package Practice;

import java.util.Scanner;

public class VowelOrConsonentOrInvalid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char input;
		System.out.println("Enter any character");
		Scanner scan=new Scanner(System.in);
		input=scan.next().charAt(0);
		if(Character.isLetter(input))
		{
			if( input=='a'||input=='e'||input=='i'||input=='o'||input=='u'||input=='A'||input=='E'||input=='I'||input=='O'||input=='U')
		{
			System.out.println("given input is vowel");
		}
		else
		{
			System.out.println("given input is consonent");

		}
		}
		else {
			System.out.println("invalid input");
		}


	}

}
