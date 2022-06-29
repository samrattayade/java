
// Open Second.java    public keyword
/*
public class Modifiers {
	  public String fname = "John";
	  public String lname = "Doe";
	  public String email = "john@doe.com";
	  public int age = 24;
}

*/

// private keyword
/*
public class Modifiers {
  private String fname = "Samrat";
  private String lname = "Tayade";
  private String email = "Samrat@tayade.com";
  private int age = 24;
  
  public static void main(String[] args) {
	  Modifiers myObj = new Modifiers();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}
*/


/*
// protected

class Person {
  protected String fname = "John";
  protected String lname = "Doe";
  protected String email = "john@doe.com";
  protected int age = 24;
}

class Modifiers extends Person {
  private int graduationYear = 2020;
  public static void main(String[] args) {
	  Modifiers myObj = new Modifiers();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
  }
}

*/


// abstract
/*

abstract class Language {

  // method of abstract class
  public void display() {
    System.out.println("This is Java Programming");
  }
}

class Modifiers extends Language {

  public static void main(String[] args) {
    
    // create an object of Main
	  Modifiers obj = new Modifiers();

    // access method of abstract class
    // using object of Main class
    obj.display();
  }
}

*/


// final
/*
class Bike{  
  final void run(){System.out.println("running...");}  
}  
class Modifiers extends Bike{  
   public static void main(String args[]){  
    new Modifiers().run();  
   }  
}  

*/


//Java Program to get the cube of a given number using the static method  
 /*
class Modifiers{  
  static int cube(int x){  
  return x*x*x;  
  }  
  
  public static void main(String args[]){  
  int result=Modifiers.cube(5);  
  System.out.println(result);  
  }  
}  

*/

//strictfp
/*

public strictfp class Modifiers 
{
	public static void main(String[] args) 
	{
		double MAX = Double.MAX_VALUE;
		
		System.out.println(Double.MAX_VALUE - 1);
	}
}

*/

// native

/*
 * Main.java
 * 
 * public class Main { public native int square(int i); public static void
 * main(String[] args) { System.loadLibrary("Main"); System.out.println(new
 * Main().square(2)); } } Main.c
 * 
 * #include <jni.h> #include "Main.h"
 * 
 * JNIEXPORT jint JNICALL Java_Main_square( JNIEnv *env, jobject obj, jint i) {
 * return i * i; } Compile and run:
 * 
 * sudo apt-get install build-essential openjdk-7-jdk export
 * JAVA_HOME='/usr/lib/jvm/java-7-openjdk-amd64' javac Main.java javah -jni Main
 * gcc -shared -fpic -o libMain.so -I${JAVA_HOME}/include \
 * -I${JAVA_HOME}/include/linux Main.c java -Djava.library.path=. Main Output:
 * 
 * 4
 */

//transient

/*
import java.io.Serializable; 
import java.io.*;  

class Modifiers {

    public static class  Member implements Serializable{
        transient int id; // This will not serialized.
        String name;
        // constructor
        public Member(int i, String k) {
            this.id = i;
            this.name = k;
        }
    }

    public static void main(String args[]) throws Exception {
        Member temp =new Member( 2, "Clausia");//creating object
        //writing temp object into file
        FileOutputStream fread=new FileOutputStream("member.txt");
        ObjectOutputStream fout=new ObjectOutputStream(fread);
        fout.writeObject(temp);
        fout.flush();

        fout.close();
        fread.close();
        System.out.println("Data successfully saved in a file");
        
        // retrieving the data from file.
        ObjectInputStream fin=new ObjectInputStream(new FileInputStream("member.txt"));
        Member membr=(Member)fin.readObject();
        System.out.println(membr.id+" "+membr.name+" ");
        fin.close();
    }
}

*/
//volatile
/*
class Modifiers extends Thread{
    //volatile
    boolean keepRunning = true;

    public void run() {
        long count=0;
        while (keepRunning) {
            count++;
        }

        System.out.println("Thread terminated." + count);
    }

    public static void main(String[] args) throws InterruptedException {
    	Modifiers t = new Modifiers();
        t.start();
        Thread.sleep(1000);
        System.out.println("after sleeping in main");
        t.keepRunning = false;
        t.join();
        System.out.println("keepRunning set to " + t.keepRunning);
    }
}

*/


//synchronized

/*
class PrintDemo {
   public void printCount() {
      try {
         for(int i = 5; i > 0; i--) {
            System.out.println("Counter   ---   "  + i );
         }
      } catch (Exception e) {
         System.out.println("Thread  interrupted.");
      }
   }
}
class ThreadDemo extends Thread {
   private Thread t;
   private String threadName;
   PrintDemo  PD;

   ThreadDemo( String name,  PrintDemo pd) {
      threadName = name;
      PD = pd;
   }
   
   public void run() {
      PD.printCount();
      System.out.println("Thread " +  threadName + " exiting.");
   }

   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

public class Modifiers {
   public static void main(String args[]) {
      PrintDemo PD = new PrintDemo();

      ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
      ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );

      T1.start();
      T2.start();

      // wait for threads to end
         try {
         T1.join();
         T2.join();
      } catch ( Exception e) {
         System.out.println("Interrupted");
      }
   }
}


*/







