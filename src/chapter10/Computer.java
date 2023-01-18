package chapter10;

public class Computer extends Calculator {

	@Override
	double areacircle(double r) {
		System.out.println("Computer 메소드 areaCircle() 실행");
		
		return Math.PI*r*r; //파이
	}

	
	
	
}
