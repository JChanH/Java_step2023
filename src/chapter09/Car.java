package chapter09;

public class Car {

	public int speed;

	public void speedUp() {
		speed +=1;
		
		
	}
	public final void stop() {

		System.out.println("스포츠카가 멈춥니다");
		speed=0;
	}

}
