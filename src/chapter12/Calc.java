package chapter12;

public interface Calc {

	double PI = 3.14;
	int ERROR = 99999;

	int add(int num1, int num2);

	int substar(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	default void description() {
		System.out.println("정수 계산기를 구현합니다");
		myMethod(); // 같은 클라스의 private method 호출

	}

	static int total(int[] arr) { // 배열타입을 사용
		int total = 0;

		for (int i : arr) { // 배열수만큼 더해주기
			total += i;

		}
		mySraticMethod(); //
		return total;

	}

	private void myMethod() { // 메소드가 private인 경우에는 해당 클래스 내부에서만 사용 가능함
		System.out.println("private 메서드 입니다");
	}

	private static void mySraticMethod() {
		System.out.println("private static 메서드 입니다");
	}

	// 인터페이스 요소
	/*
	 * 추상메소드 : body가 없는 메소드(무조곤 재정의하여 사용) 자바 8부터 제공 디폴트메소드 : 기본 수행문을 가질수 있는 메소드이며
	 * 재정의를 할 수 있다. 정적(static) 메소드 : 객체 생성과 무관하게 인터타입(클래스명)으로 사용 가능 private메소드 :
	 * 인터페이스 구현한 클래스에서 사용가능 재정의 할 수 없음
	 * 
	 * 
	 */

}
