package Pactice;

import java.util.Scanner;

public class Actor {
	public static void main(String[] args) {
		var actor = new String[][] { 
			//var =>변수를 선언하는 경우 타입을 생략하는 것이 가능하다
				{ "[송강호]", "박쥐", "괴물", "관상" }, 
				{ "[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게" },
				{ "[이병헌]", "지아이조", "레드", "광해" } 
				};
		int cnt = -1;

		try (var scan = new Scanner(System.in)) { //try문에 스캔 붙여도 괜찮음
			System.out.print("검색할 배우 : ");
			var actName = scan.next();

			for (int i = 0; i < actor.length; i++) { //행의 길이
				if (("[" + actName + "]").equals(actor[i][0])) { //행의 배우명과 같은지 확인
					cnt = i; //같으면 cnt는 해당 열을 가리킨다
					break;
				}
			}

			if (cnt < 0) { //cnt가 0보다 낮으면 해당 배우는 존재하지 않음 (초기에 -1로 설정한것은 0을 기준으로 조건을 주려고 한거임)
				System.out.println("해당 배우가 존재하지 않습니다.");
				return;
			}

			for (int i = 0; i < actor[cnt].length; i++) { //열의 길이를 의미
				System.out.println(actor[cnt][i]); //행에 포함되는 열을 전부 프린트
			}
		}
	}
}