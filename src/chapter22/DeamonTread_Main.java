package chapter22;

public class DeamonTread_Main implements Runnable {

	static boolean autoSave = false; //자동저장기능 잠구기

	public static void main(String[] args) {
		// Runnable의 run()은 Thread의 객체로 반드시 변환하여 사용해야 스레드로 활용 가능하다
		DeamonTread_Main dm = new DeamonTread_Main();
		Thread t = new Thread(dm); // 스레드 객체로 변환
		// 데몬스레드 설정 : 메인이 종료되면 함께 종료됨 //15카운트를 전부 출력하면 Runnable의 run도 같이 죽음 
		t.setDaemon(true);
		t.start();

		for (int i = 1; i <= 15; i++) {
			try {
				Thread.sleep(1000); // 1초 쉼

			} catch (Exception e) {
				e.printStackTrace();
			}
			if(i==3)//3초 뒤에 저장 모드로 전환
				autoSave= true;
			System.out.println(i);
		}

	}

	//3초마다 저장을 무한 반복 
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);				
			} catch (Exception e) {
				e.printStackTrace();
			}//try
			if(autoSave == true)
				System.out.println("자동저장됨");
			
			
		}
	}

}
