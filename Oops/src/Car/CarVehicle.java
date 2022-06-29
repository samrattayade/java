//Car.java Vehicle.java
package Car;
import java.util.Scanner;

public class CarVehicle {
       public static void main(String args[]) {
         
    	   Scanner scan=new Scanner(System.in);
    	   
    	   System.out.println("Enter Cost Of Vehicle");
       	   int vehicle_cost=scan.nextInt();
       	   
       	 System.out.println("Enter Mileage Of Vehicle");
     	   int vehicle_mileage=scan.nextInt();
     	   
     	  System.out.println("Enter color Of Vehicle");
    	   String car_color=scan.next();

    	   System.out.println("Enter Tyres Of Vehicle");
     	   int car_tyres=scan.nextInt();
     	   
     	  Car obj=new Car(vehicle_cost,vehicle_mileage,car_color,car_tyres);
  		obj.show_car_details();
  		obj.show_vehicle_details();
    
       	  
       }
}
