package Practice;

public class MinimumNumberInMultiDimensionalArray {

	public static void main(String[] args) 
	{
		int a[][]=new int[3][3];
		a[0][0]=2;
		a[0][1]=6;
		a[0][2]=8;
		a[1][0]=45;
		a[1][1]=23;
		a[1][2]=1;
		a[2][0]=35;
		a[2][1]=6;
		a[2][2]=9;
		int temp = a[0][0];
		for(int i[]:a)
		{
			for(int j:i)
			{
			
				System.out.print(j+" ");
				if(temp>j)
				{
					temp=j;
				}
			}
			System.out.println();
		}
		System.out.println("minimum number is " +temp);
		
		

		
		
		

	}

}
