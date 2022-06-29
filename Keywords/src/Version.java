/*
class Version{  
//defining the enum inside the class  
public enum Season { WINTER, SPRING, SUMMER, FALL }  
//main method  
public static void main(String[] args) {  
//traversing the enum  
for (Season s : Season.values())  
System.out.println(s);  
}}  
*/

//assert

// Java program to demonstrate syntax of assertion

class Version {
	public static void main(String args[])
	{
		int value = 300;
		assert value >= 20 : " Underweight";
		System.out.println("value is " + value);

	}
}

