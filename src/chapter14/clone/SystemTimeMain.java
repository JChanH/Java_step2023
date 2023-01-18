package chapter14.clone;

public class SystemTimeMain {

	public static void main(String[] args) {
		// 시간이 얼마나 걸리는지 확인하는 알고리즘
		long time = System.nanoTime(); // 흘러가는 시간

		// 계산문
		int sum = 0;
		for (int i = 0; i <= 1000000000; i++) {
			sum += 1;

		}

		long time2 = System.nanoTime(); //여기까지
		//출력
		System.out.println("1~10000000까지의 합 :" + sum);
		System.out.println("계산에" + (time2 - time) + " 나노초가 소요되었습니다");

	}

}
