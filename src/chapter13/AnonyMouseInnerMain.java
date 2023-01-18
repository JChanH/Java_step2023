package chapter13;

class Outter2 {

	// 방법 1
	Runnable getRunnable(int i) { // 익명의 클래스는 인스턴스 이름이 없다
		int num = 100;
		// new 와 동시에 부모클래스의 run메소드를 상속받음으로 추상 메소드인 run을 반드시 오버라이딩해서 사용한다
		return new Runnable() { // 굳이 implements를 할 필요가 없음 (바로 가져와서 사용 가능함)

			@Override
			public void run() {
				// i=10; 재정의는 불가능함
				// 프린트는 가능함
				System.out.println(i);
				System.out.println(num);
			}
		}; // return 값

	}// Runnable

	// 방법2
	Runnable runner = new Runnable() { // Runnable내부에 추상 메서드가 있음 (자리 assign해주고 매게변수 지정)

		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명의 클래스 변수");
		}
	};

}

public class AnonyMouseInnerMain { // 간단한 이벤트 처리하는 경우에 사용함
	public static void main(String[] args) {

		Outter2 out = new Outter2();
		Runnable runnable = out.getRunnable(10);
		runnable.run(); // 방법 1
		out.runner.run(); // 방법2 //바로 Runnable을 불러와서 구현 가능함 

	}

}
