package Assignment;

public class Assignment2 {

	public static void main(String[] args) 
	{
		//prime numbers
		int i,j;
		for(i=1;i<=100;i++) //i=3,i=4
		{
			for(j=2;j<i;j++) // 2<3 3<3(false)  ,  2<4
			{
				if(i%j==0) // 3%2=1  ,  4%2=0(break)
				{
					break;
				}
			}
			if(i==j) // 3==3  ,  4!=2
			{
				System.out.println(i);
			}
		}

	}

}
