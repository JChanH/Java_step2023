package chapter17.arraylist_stack_queue;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("강감찬");
		list.add("을지문덕");
		list.add("김유신");
		
		System.out.println(list); //저장된 리스트를 나열한다
		
		
		System.out.println("list[0] : " + list.get(0));
		System.out.println("list[2] : " + list.get(2));
		
		
		
		
		
	}

}
