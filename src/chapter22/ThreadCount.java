package chapter22;

import java.util.Scanner;

public class ThreadCount implements Runnable {

	private int n;

	public ThreadCount(int n) {
		this.n = n;
	}

	public static void main(String[] args) {
		// 스캐너를 이용하여 키보드에서 숫자를 입력받고
		// 입력받은 숫자가 1씩 감소하다가 0이 되었을때
		// "종료"라는 메세지와 함께 스레드 빠져나오기
		System.out.println("값을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		ThreadCount tc = new ThreadCount(num); //값을 ThreadCount에 n값으로 올린다
		// 쓰레드 객체 및 실행
		Thread t = new Thread(tc); // 쓰레드로 변환해주기
		t.start();
		scan.close();
	}

	@Override
	public void run() {
		for (int i = n; i >= 0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (i == 0) {
				System.out.println("종료");
			}
		}
	}
}