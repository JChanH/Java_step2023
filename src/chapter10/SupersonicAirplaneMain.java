package chapter10;

public class SupersonicAirplaneMain {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC; //flymode에 SUPERSONIC의 값인 2를 넣어준다
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
	
	}
}
