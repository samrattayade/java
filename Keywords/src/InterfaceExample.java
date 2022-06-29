interface WaterBottleInterface{                // interface and implements
	String color ="Blue";
	
	void fillUp();
	
}


public class InterfaceExample implements WaterBottleInterface{

	public static void main(String[] args) {
     System.out.println(color);
     
     InterfaceExample ex=new InterfaceExample();
     ex.fillUp();
	}

	@Override
	public void fillUp() {
     System.out.println("It is Filled");		
	}

}
