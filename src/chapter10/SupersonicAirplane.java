package chapter10;

public class SupersonicAirplane extends Airplane {

	// normal한 비행 = 1 supersonic = 2
	// 필드(전역변수, 변경 불가능하게 선언), (전역변수로만 쓰려면 싱글턴??)

	public static final int NORMAL = 1; //절대 변하면 안되는 값
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL; //flymode == 1

	// 오버라이딩을 이용하여 flymode가 supersonic이면 초음속 비행입니다. 아니면 airplane의 fly 실행

	@Override
	public void fly() {
		if (flyMode == 1) {
			super.fly(); //super를 통해서 Airplane의 메소드를 끌어다가 사용가능함
		}else {
			System.out.println("초음속 비행입니다");
		}
	}

}
