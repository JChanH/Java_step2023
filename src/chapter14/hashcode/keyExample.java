package chapter14.hashcode;

import java.util.HashMap;

public class keyExample {

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		// String => 저장되는 데이터의 타입
		// Key => 식별키의 객체를 이용하여 이름을 반환

		System.out.println(hashMap); //아무런 값이 없으면 공백을 출력 {}

		// 식별키의 객체를 이용하여 이름을 반환
		hashMap.put(new Key(1), "홍길동");// 스스로의 Key값을 주소로 하겠다 (본래 시스템 주소가 할당됨)
		System.out.println(hashMap); //저장되어 있는 KEY 값과 VALUE값이 전부 나온다
		hashMap.put(new Key(1), "김유신");
		System.out.println(hashMap);
	}
}
