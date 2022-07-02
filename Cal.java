import java.util.Scanner;
public class Cal {

	public static void main(String[] args) {
		System.out.println("Enter First Number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("First Number:\t"+a);
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		System.out.println("Second Number:\t"+b);
		
		System.out.println("Select Operation: 1.add,2.sub,3.mul,4.div");
	int c,add,sub,mul,div;
		int s=sc.nextInt();
		
		if(s==1) {	
			c=a+b;
			System.out.println("Addition: "+c);
		}
		if(s==2) {	
			c=a-b;
			System.out.println("Substraction: "+c);
		}
		if(s==3) {	
			c=a*b;
			System.out.println("Multiplication: "+c);
		}
		if(s==4) {	
			c=a/b;
			System.out.println("Division: "+c);
		}
		
		
		
		
		sc.close();
		
	}

}
