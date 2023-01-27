package chapter17.hashset;

import java.util.HashSet;

public class SetNumber {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		while (true) {
			// 난수 발생
			int v = (int) (Math.random() * 45 + 1);
			// int v = new random().nextInt(45) + 1; 동일함

			hs.add(v); // 중복을 허용하지 않음으로 따로 메소드를 설정할 필요가 없다.
			if (hs.size() >= 6)
				break;

		}
		System.out.println(hs);

	}
}
