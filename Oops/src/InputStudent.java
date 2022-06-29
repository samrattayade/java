//Run From OutStudent.java
import java.util.Scanner;
public class InputStudent {
    Scanner scan=  new Scanner(System.in);
    String name ="";
    int marks =0;
    public void get_details() {
    	System.out.println("Enter your name: ");
    	name = scan.nextLine();
    	
    	System.out.println("Enter your marks: ");
    	marks =scan.nextInt();
    	
    }
    public void show_details() {
    	System.out.println("Name of the Student is : "+name);
    	System.out.println("Marks of the Student is : "+marks);
    }
}
