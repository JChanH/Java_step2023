package chapter17.hashset;

import java.util.HashSet;
import java.util.Set;

import chapter17.arraylist_stack_queue.Member;

public class MemberHashSetMain {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member(30, "홍길동"));
		set.add(new Member(30, "홍길동"));
		
		System.out.println("총 객체수 : " + set.size()); //중복을 허용하지 않음으로 하나만 있아야 하지만 
		
		
		
	}

}
