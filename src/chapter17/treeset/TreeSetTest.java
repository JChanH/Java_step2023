package chapter17.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("홍길동");
		treeSet.add("김강찬");
		treeSet.add("이순신");
		
		//트리셋은 기본적으로 오름차순으로 올라간다
		for(String str : treeSet) {
			System.out.println(str);
			
		}
		
		
	}

}
