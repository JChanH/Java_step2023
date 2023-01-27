package chapter18.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest3 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		// HashMap에 정보 입력 //key , value
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("아이디 :");
			String id = scan.next();
			System.out.println();

			if (map.containsKey(id)) { // Hashmap에 키가 있는가 판단
				System.out.println("비밀번호 :");
				String pw = scan.next();
				if (map.get(id).equals(pw)) { // id를 꺼내오면 value값이 나옴 ==> pw와 비교
					System.out.println("로그인 성공");
					break;

				}else {//
					System.out.println("비밀번호가 일치하지 않습니다");
					continue;
				}//inner if

			}else {
				System.out.println("입력하신 아이디가 없습니다");
				break;
			}//out if 

		}//while

	}

}
