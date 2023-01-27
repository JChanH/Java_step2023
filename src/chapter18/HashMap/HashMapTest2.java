package chapter18.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// Map<String integer>생성 map (key값와 value값)
		Map<String, Integer> map = new HashMap<String, Integer>();
		//팀원 데이터(성함, 학번)저장 (put으로 정보 입력)
		map.put("박창훈", 1);
		map.put("이석진", 2);
		map.put("이석진", 3);
		map.put("이세정", 4);
		map.put("장준근", 5);
		map.put("한성무", 6);
		
		//팀원의 인원
		System.out.println("팀 인원 : " + map.size()); //저장된 값들의 곗수
		System.out.println("-----------------------------");
		
		//팀장의 학번을 알아내자
		System.out.println("팀장 학번");
		System.out.println(map.get("박창훈")); //get을 통해서 Value값 출력
		System.out.println("-----------------------------");
		
		//팀원 모두의 학번 출력
		Set<String> keySet =map.keySet(); //keyset는 키값만 불러냄 (Set으로 다시 정렬하면 중복값이 사라진다, Set의 특성) //entryset같은 경우에는 key값과 value 값을 전부 불러오기 때문에 저장되는 인자 타입을 Map<String, Integer>로 맞춰주어야 한다
		Iterator<String> keyIterator = keySet.iterator(); //iterator를 통해 순환시킨다
						
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); //순환된 ketSet의 값을 다시 String key가 받고
			Integer value = map.get(key); //다시 key값을 입력하여 value 값을 받는다
			System.out.println("\t" + key + ":" + value);
		}//while
	
		
		System.out.println();
		
	}//main

}//class