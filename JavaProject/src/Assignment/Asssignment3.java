package Assignment;

public class Asssignment3 {

	public static void main(String[] args) 
	{
	    int n = 10, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", "); //ft=0    ft=1
	      
	      // compute the next term
	      int nextTerm = firstTerm + secondTerm; // nt=0+1   nt=1+1
	      firstTerm = secondTerm; //ft=1
	      secondTerm = nextTerm; //st=1,2
	    }

	}

}

