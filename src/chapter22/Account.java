package chapter22;

public class Account {

	int balance = 1000; // 잔액

	// 출금 메소드
	public synchronized void withdraw(int money) { // synchronized : 동기화

		if (balance < money) { // 인출하려는 돈이 잔액보다 많은 경우에는 잠시 정시 상태로 해줌
			try {
				wait(); // 스레드가 일시적으로 정지상태에 빠짐
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		balance -= money;

	}

	// 입금 메소드
	public synchronized void deposit(int money) {
		balance += money;
		// 정지상태를 풀어주어야 함
		notify(); // 정지된 스레드 해제
	}
}
//멀티스레드 환경에서 고려해야할 스레드간의 동기화
//예를 들어 스레드간에 공유하는 Data가 존재할시 수정하고 삭제하는 과정에서 동기화를 유지 시켜야 한다(synchronized)
//자바에서는 synchronized를 통해서 동기화를 시켜준다