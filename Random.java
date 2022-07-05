//Game Guess the number
import java.lang.Math;
import java.util.Scanner;
public class Random {

	public static void main(String[] args) {
  double ra =(int)(Math.random()*100);
int a;  
Scanner sc=new Scanner(System.in);

do {

          System.out.println("Value:");
          
          a=sc.nextInt();
      if(ra==a) {
    	  System.out.println("Same number!!");
      }
      if(ra<a) {
    	  System.out.println("Big number");
      }
      if(ra>a) {
    	  System.out.println("small number");
      }
    	  
}while(ra!=a);
      
    	  sc.close();
    	  }
	}  
