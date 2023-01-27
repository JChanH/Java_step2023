package chapter18.HashMap;

import java.util.HashMap;
import java.util.Iterator;

import chapter17.Member2;

public class MemberHashMap {

	private HashMap<Integer, String> hashMap;

	public MemberHashMap(HashMap<Integer, String> hashMap) {
		super();
		this.hashMap = hashMap;
	}

	// remove
	public boolean removeMember(int memberId) {
		while (hashMap.containsKey()) { // 읽는게 가능하면 계속 실행

		}
	}System.out.println(memberId+"는 없습니다");


	// 출력
	public void showAllMember() {
		
		Iterator<Integer>ir = hashMap.keySet().iterator();
		for (ir.hasNext()) { // LinkedList의 값의 숫자대로 member에 저장하고 아래 실행문 실행
			int key = ir.next();
			String member=hashMap.get(key);
				System.out.println(member);
		}
		System.out.println();
		}

}
