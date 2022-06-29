/*
public class Methodlevel {

	static void	 MyMethod() {
		// Void and Return
          System.out.println("executed !");
	}
	public static void main(String args[]) {
		MyMethod();
	}
}
*/


public class Methodlevel{
	static int computeSize(int height, int width) {
        // Return an expression based on two arguments (variables).
        return height * width;
    }
    
    public static void main(String[] args) {
        
        // Assign to the result of computeSize.
        int result = computeSize(10, 3);
        System.out.println(result);
    }
}