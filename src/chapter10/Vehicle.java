package chapter10;

public class Vehicle {

	public static final int price = 1000;
	
	public int vehiclePrice() {
		return this.price; //어디에서나 해당 메소드를 사용하면 price값을 돌려받는다
		
	}
	
	public void run() {
		System.out.println("차량이 달립니다");
	}
	
	
}
