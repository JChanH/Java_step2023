package chapter11;

public abstract class Car {

	public abstract void drive();

	public abstract void stop();

	public void startCar() {
		System.out.println("킵니다");

	}

	public void turnoff() {
		System.out.println("끕니다");

	}

	// 템플릿 메소드 (재정의가 안되게 구현)
	public void run() {
		startCar();
		drive();
		stop();
		turnoff();

	}
}
