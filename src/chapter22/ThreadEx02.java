package chapter22;

public class ThreadEx02 extends Thread {

	private int[] temp;

	public ThreadEx02() {
		//초기화
		temp = new int[10];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;

		}

	}

	@Override
	public void run() {
		for (int i : temp) {
			//1초 쉬고 temp 값을 출력함
			try {
				Thread.sleep(1000); //1000==1초
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("temp : " +temp[i]);
		}
	}

}
