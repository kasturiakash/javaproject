package Assignment;
class Constants {
    static final int MAX_VALUE = 100;
}
class NonStatAndStat {
    static int staticVariable = 10;
    static void staticMethod() {
        System.out.println("This is a Static method");
    }
    void nonStaticMethod() {
        int a = 5; //local variable
        System.out.println("Local variable: " + a);
    }
}
public class Assignment1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Calling static method and variable from NonStatAndStat class:");
	     NonStatAndStat.staticMethod();
	     System.out.println("Static variable: " + NonStatAndStat.staticVariable);
	     System.out.println("\nCalling non-static method and local variable from NonStatAndStat class:");
	     NonStatAndStat NonStatAndStatObj = new NonStatAndStat();
	     NonStatAndStatObj.nonStaticMethod();
	     System.out.println("Accessing constant from Constants class: " + Constants.MAX_VALUE);		
	}
}


