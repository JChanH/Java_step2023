package chapter22;

import java.util.Random;

public class AccountThread implements Runnable {

	Account acc;

	public AccountThread(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(2000); //5초 쉬고 실행
			} catch (Exception e) {
				e.printStackTrace();
			}
			//출금액을 100 ~ 300원 사이의 난수로 지정해서 빠짐
			int money = (new Random().nextInt(3)+1)*100;
			acc.withdraw(money);
			System.out.println("잔액 : " + acc.balance);
			
			
			
			
		}
		
	}

}
