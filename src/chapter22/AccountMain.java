package chapter22;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {

		
		
		Account acc = new Account();
		Runnable r = new AccountThread(acc); //상위 클래스를 앞에 위치시킴 (부모클라스인 Runnable을 사용해 주는것이 맞음)
		Thread t1 = new Thread(r);
		t1.start();
			
		//스레드와는 별개롤 값을받아 입금 시키는 코드 
		while (true) {
			System.out.print("입금할 돈을 입력하세요: ");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			acc.deposit(n);
			if (acc.balance ==0) {
				break;
				
			}
			scan.close();
		}
		
		
		
	}
}
