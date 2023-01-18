package chapter11;

public class CarMain {
/*
	public static void main(String[] args) {
	method(new ManualCar());
	System.out.println("================================");
	method(new AICar());
	
		
	}

	public static method(Car car) {
	car.drive();
	car.stop();
	}
	
	*/
	public static void main(String[] args) {
		
		System.out.println("자율주행");
		Car mycar = new AICar(); //Car중에서 AICar가 받은 정보를 사용한다
		mycar.run(); //AICar의 정보를 받아서 사용함 
		
		System.out.println("사람이 운전 하는 자동차");
		Car hiscar=new ManualCar(); //현재 
		hiscar.run();
		
	}
	
	
	
	
	
}
