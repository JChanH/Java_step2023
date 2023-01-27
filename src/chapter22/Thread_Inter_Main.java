package chapter22;

public class Thread_Inter_Main implements Runnable {

	public static void main(String[] args) {

		System.out.println("메인 클래스 시작");
		Thread_Inter_Main t1 = new Thread_Inter_Main();
		// t1.run();// 순차적으로 실행됨 (일반적인 호출)
		Thread mThread = new Thread(t1); // t1을 넣어서 쓰레드로 변환
		mThread.start(); //main 과 다르게 독립적으로 움직인다 (독립적인 자원을 소모한다??) main을 실행한 이후에 실행됨
		System.out.println("메인 클래스 종료");
	}// main

	@Override
	public void run() {
		System.out.println("run() 메서드 수행!");
		first();
	}

	public void first() {
		System.out.println("first 메서드 수행!");
		second();
	}

	public void second() {
		System.out.println("second 메서드 수행!");
	}
}
/*메인 클래스 시작
run() 메서드 수행!
first 메서드 수행!
second 메서드 수행!
메인 클래스 종료
*/