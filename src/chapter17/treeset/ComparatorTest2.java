package chapter17.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	public int compare(String s1, String s2) { // 두개의
		return (s1.compareTo(s2)) * -1; // *-1 : 내림차순
	}
}

public class ComparatorTest2 {

	public static void main(String[] args) {

		// Set<String> set = new TreeSet<String>(); //String 클래스는 이미 Comparable인터페이스가
		// 구현되어 있으므로 오름차순으로 정렬되어 출력됨

		Set<String> set = new TreeSet<String>(new MyCompare()); // 내림차순
		// set매개변수를 사용하여 4개의 객체를 만들어 낸다
		set.add("aaa");
		set.add("ddd");
		set.add("hhh");
		set.add("bbb");

		System.out.println(set);

	}

}
