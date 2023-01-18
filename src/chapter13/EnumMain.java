package chapter13;

import java.util.Scanner;

public class EnumMain { // 나열하다라는 뜻

	public enum Item {// 자동으로 나열된다
		Start, pause, Exit // 0,1,2 (Static final로 되어 있음)
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("숫자를 입력하세요 [0: 게임시작, 1:일시정지, 2:게임종료]");

			int n = scan.nextInt();
			Item start = Item.Start; // start에 있는 0번이 넘어옴
			Item pause = Item.pause; // 1번이 넘어옴
			Item Exit = Item.Exit; // 2번이 넘어옴

			if (n == start.ordinal()) { // ordinal (기억된 숫자를 불러옴
				System.out.println("게임이 시작됨");
			}else if (n == pause.ordinal()) {
				System.out.println("게임이 일시정지됨");
				
			}else {
				System.out.println("게임 종료");
				return; //끝나고 나감
			}
		}

	}

}
