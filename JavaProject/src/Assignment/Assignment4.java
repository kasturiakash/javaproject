package Assignment;

public class Assignment4 {

	public static void main(String[] args) 
	{
		String str="akash";
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reversed string is: "+rev);
	}

}
