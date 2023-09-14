package Assignment;

public class VariableTypesExample {
	// Instance variables
    int instanceVar = 10;
    static int staticVar = 20;
    
    public void methodExample() {
        // Local variable
        int localVar = 30;
        
        System.out.println("Local variable: " + localVar);
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	VariableTypesExample obj1 = new VariableTypesExample();
	        
	        obj1.methodExample();
	        System.out.println(staticVar);
	        
	        // Accessing static variable directly using class name
	        System.out.println("Static variable accessed using class name: " + VariableTypesExample.staticVar);

	}

}


