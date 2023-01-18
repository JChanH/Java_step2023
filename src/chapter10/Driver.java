package chapter10;

public class Driver {
	//메서드를 통해 다른 매서드를 불러줄수 있음 
	//현재 Vehicle은  Bus의 run()과 Taxi의 run()에 override되어 있는 상태임

	public void drive(Vehicle vehicle) {//클래스의 메개변수를 넣어주는것도 가능하다 (Vehicle클라스 타입을 사용중이가)
		vehicle.run();
	}
	
}
