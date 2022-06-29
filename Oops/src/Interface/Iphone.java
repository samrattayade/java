package Interface;

public class Iphone	implements Phone {
	public void cost() {
		System.out.println("Cost of Iphone is 700$");
	}
	public void color() {
		System.out.println("Color of Iphone is Silver");
	}
	public void batterylife() {
		System.out.println("Battery life of Iphone is 24 hours");
		
	}
	@Override
	public void batteryLife() {
		// TODO Auto-generated method stub
		
	}
}
