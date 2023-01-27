package chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx1 {

	public static void main(String[] args) {
		// Collection 계열의 List => Arraylist
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("list.size : " + list.size());
		list.add(100);
		list.add(20);
		System.out.println("list.size : " + list.size());
		System.out.println("------------------------");
		// 인텍스로 접근하는 구조는 깊이가 있으면 있을수록 속도가 느려짐 (자료가 나열된게 아닌 사방에 펴져있음)
		// 그 문제점을 해결하기 위해 Iterator

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		System.out.println("------------------------");
		// 1) List구조의 자원을 반복자로 변환
		Iterator<Integer> it = list.iterator();
		// 2) 반복자를 반복문으로 수행 (hasNext 다음 자료가 있는지 확인
		while (it.hasNext()) {// 반복자 안에서 커서가 이동
			int v = it.next(); // 다음 자료가 있으면 가져옴 (자동 언박싱 - 기본 자료형으로 변환)
			System.out.println(v);
		}

	}

}
