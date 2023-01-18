package chapter17.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// 리스트구조를 갖는 ArrayList 클래스의 객체생성
		// 일반적인 배열 표현 (수정이 어려움)
		// String[] Is = {};
		// 리스트에 데이터를 추가하는 만큼 사용
		List<String> ls = new ArrayList<String>(); // List 가 부모 ArrayList 가 자식
		ls.add("hi");
		ls.add("happy");
		ls.add("nice");

		for (int i = 0; i < ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i));

		}
		System.out.println();
		System.out.println("---------데이터 추가후---------- ");
		ls.add(3, "good");
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i));
		}
		System.out.println();
		System.out.println("---------데이터 삭제-------------");
		ls.remove(0);
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i));
		} //linked 

	}

}
