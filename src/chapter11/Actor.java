package chapter11;

import java.util.Scanner;

public class Actor {
	String[][] actor = { { "[송강호]", "박쥐", "괴물", "관상", "기괴괴" }, { "[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게" },
			{ "[이병헌]", "지아이조", "레드", "광해" } };

	public void search() {
		int cnt = 0;
		System.out.println("검색할 배우 :");
		Scanner scan = new Scanner(System.in);
		String act = scan.next();
		for (int i = 0; i < actor.length; i++) { // i < actor.length
			if (actor[i][0].equals("[" + act + "]")) { 
				for (int j = 0; j < actor[i].length; j++) // 있는지 없는지 판단
					System.out.println(actor[i][j]); // 있으면 다 보여줘

			} else {
				cnt++;
				if (cnt >= actor.length) { //3바뀌 돌고 없으면
					System.out.println("해당배우가 존재하지 않습니다.");
				} // inner if

			}
		}
	}
}
