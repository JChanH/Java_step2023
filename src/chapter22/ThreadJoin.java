package chapter22;

public class ThreadJoin implements Runnable {

	public static void main(String[] args) {
		System.out.println("메인플래스 시작!");
		ThreadJoin t1 = new ThreadJoin();
		Thread JThread = new Thread(t1);
		JThread.start();

		try {
			JThread.join(); // run() 메서드와 Main()메서드가 Join (본래라면 둘이 독립적으로 수행됨)
			// main과 같이 순차적으로 실행한다
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("메인플래스 종료!");

	}
//====================================================================================//
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
