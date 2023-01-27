package chapter19.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");

		// List => Stream (형변환)
		Stream<String> stream = sList.stream();
		// element가 들어오면 출력
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// foreach 대신 사용가능한 메소드
		for (String s : sList) {
			System.out.print(s + " ");
		}

		System.out.println("정렬 후 출력"); // 알파벳 순서대로
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		// 각 요소의 길이를 계산하고 각자 프린트 해준다
		//map => 요소의 타입 변경
		//filter => 요소 자체를 반환
		sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
		sList.stream().filter(s -> s.length() >= 5).forEach(n -> System.out.println(n));

	}

}
