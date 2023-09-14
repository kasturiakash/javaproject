package JavaSamples;

public class Stars {

	public static void main(String[] args) 
	{
        
        // 1st loop
        for (int i = 0; i < 10; i++) 
        {
 
            // nested 2nd loop
            for (int j = 2 * (10 - i); j >= 0; j--) 
            {
                // printing spaces
                System.out.print(" ");
            }
 
            // nested 3rd loop
            for (int j = 0; j <= i; j++)
            {
                // printing stirs
                System.out.print("* ");
            }
 
            // end-line
            System.out.println();
        }

	}

}
