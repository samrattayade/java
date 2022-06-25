import java.util.Scanner;  // Import the Scanner class

class Input {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Your Name");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Name: " + userName);  // Output user input
  }
}