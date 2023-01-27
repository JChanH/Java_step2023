package chapter18.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>(); // 해쉬맵으로 메모리 할당

		// 앞의 값이 key값, 뒤에 값이 value
		map.put("김치맨", 85);
		map.put("홍길동", 90);
		map.put("홍길동", 98);
		map.put("동장군", 75);

		System.out.println("총 Entry 수 :" + map.size()); // 자료가 몇개나 들어가 있는지 확인

		// 객체찾기
		System.out.println("\t홍길동 : " + map.get("홍길동")); // get==> 키값을 입력하녀 value값을 리턴함
		System.out.println("--------------------------------");

		Set<String> keySet = map.keySet(); // set계열은 중복을 허용하지 않음 (키값들을 모두 받기) // 키값들을 전부 Set특성으로 받아서 중복을 지운다
		Iterator<String> keyIterator = keySet.iterator(); // 다시 Iterator로 옮겨서 Key를 순환시킨다 //
		// Iterator를 통해서 값을 정렬시키기
		while (keyIterator.hasNext()) { //
			String Key = keyIterator.next(); // Key
			Integer value = map.get(Key); // Value
			System.out.println("\t" + Key + ":" + value);

		}
		System.out.println();

		System.out.println("-------------------------------");
		map.remove("김치맨"); //Key값으로 삭제 
		System.out.println("총 Entry 수 :" + map.size());
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // entrySet모든 정보를 다 끌고 나오는것(Key와 value값이 반환된다)//(Map.Entry<x,y> 맵형태의 인터페이스를 만드는데 사용됨 ) 
		//entrySet으로 Key값과 Value값이 같이 출력되는데 이것을 Set 형태로 받으려면 인자값을 Map.Entry<String, Integer>로 받아야 한다 

		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator(); //동일하게 인자값을 Map.Entry<String, Integer>로 받아야 한다
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next(); //다음에 오는 값을 Map.Entry<String, Integer> 인자값으로 저장하고
			String key = entry.getKey(); //Map.Entry<String, Integer>의 Key값을 String key에 저장한다
			Integer value = entry.getValue(); ////Map.Entry<String, Integer>의 value 값을 Integer value에 저장한다
			System.out.println("\t" + key + " : " + value);

		}
		System.out.println();
	}

}
