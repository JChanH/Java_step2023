package chapter10;

public class Bus extends Vehicle {

	public int busnum = 1004;

	@Override
	public void run() {
		System.out.println(busnum + "이 달립니다.");
	}

}
