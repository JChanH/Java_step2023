package chapter22;

import java.util.Random;

public class HumanRacingMethod {

	int[] playerRandom = new int[5]; // 플레이어 5명 +
	String[] playerJump = {"","","","",""};
	boolean finish = true;
	int finishPlayer = 0;
	
	public void run() {
		while (finish) {
			// 도약거리
			for (int i = 0; i < playerRandom.length; i++) {
				// 각각의 액션을 수치화 (얼마나 점프를 뛸지)
				playerRandom[i] = new Random().nextInt(4); // 0,1,2,3 (각 배열에 랜덤한 숫자들을 넣어줌)

			}
			// 0.1초 간격으로 휴식

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 각 선수에게 도약거리 적용
			for (int i = 0; i < playerRandom.length; i++) {
				switch (playerRandom[i]) { //playerJump거리에 누적시킨다
				case 0:
					playerJump[i] += "";
					break;
				case 1:
					playerJump[i] += " ";

					break;
				case 2:
					playerJump[i] += "  ";

					break;
				case 3:
					playerJump[i] += "   ";

					break;
				}// switch

			} // for
				// 달리기//패널에서 실행
			System.out.println("--------------------------------------------------------------");
			for (int i = 0; i < playerRandom.length; i++) { //5번 실행 => 5명의 플래이어를 표시
				System.out.print(playerJump[i]); //누적해주기
				System.out.println(i + 1 + "옷"); //몇번째 선수인지

				if (playerJump[i].length() >= 50) {//길이 누적값이 100을 넘으면 끝남
					finishPlayer = i + 1;
					finish = false;

				}//if
			}//for
			System.out.println("---------------------------------------------------------------");
		}
		System.out.println("승리자는 : " + finishPlayer);
	}

}
