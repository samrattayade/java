//Java does not support the goto statement. Instead, it has label. 
//Labels are used to change the flow of the program and jump to a specific
//instruction or label based on a condition.
//The following illustration may help you to better understand what a label is.

/*        // break and continue is used for goto constants
public class Unused {
	
	    public static void main( String args[] ) {
	      label:
	      for (int i=0;i<6;i++)
	      {
	        if (i==3)
	        {
	          continue label; //skips 3
	        }
	        System.out.println(i);
	      }
	    }
	          
}
*/


class Unused {
 
    public static void main(String[] args) {
        final double Pi = 3.1415926536;
        /* 
        Since the constant Pi is a floating point variable, we have to make variables length1 and length2 
        either float or double.
        */
        double lengthl = 2*Pi*10;
        double length2 = 2*Pi*25;
        System.out.println ("The perimeter of a circle with a radius of 10 cm. is " + lengthl + ", and the "
        		+ "perimeter of a circle with a radius of 25 cm. is " + length2);
    }
}