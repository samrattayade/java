//run in CarVehicle.java
package Car;
public class Vehicle {
           int cost =0;
           int mileage =0;
           
           public Vehicle(int c, int m) {
        	   cost =c;
        	   mileage=m;
           }
           public void show_vehicle_details() {
        	   System.out.println("I am a vehicle");
        	   System.out.println("The cost of the vehicle "+cost);
        	   System.out.println("The mileage of vehicle "+mileage);
        	   
           }
}
