package chapter18.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		// 학생정보, 점수 (중복없음)
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "김민주"), 66);
		map.put(new Student(3, "서주희"), 33);
		map.put(new Student(4, "하동길"), 92);

		// 저장된 총 Entry수 출력
		System.out.println("총 Entry 수 : " + map.size());

		// 하나씩 처리하는 방법
		Set<Student> keySet = map.keySet(); // 키값이 전부 넘어감
		Iterator<Student> ketIterator = keySet.iterator();
		while (ketIterator.hasNext()) {
			Student key = ketIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		Scanner scan = new Scanner(System.in);
		Student std;
		int input;
		String name;
		while (true) {
			System.out.print("학생 번호를 입력하세요 : ");
			input = scan.nextInt();
			System.out.print("학생의 이름을 입력하세요 :");
			name = scan.next();
			System.out.println();
			std = new Student(input, name);
			if (map.containsKey(std)) {
				System.out.println(map.values());
				break;

			} else {//
				System.out.println("해당 학생이 존재하지 않습니다");
			} // inner if

		} // out if

	}// while

}
