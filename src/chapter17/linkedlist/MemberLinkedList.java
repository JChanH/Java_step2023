package chapter17.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import chapter17.arraylist_stack_queue.Member;

public class MemberLinkedList {

	private LinkedList<Member> linkedList;

	// 생성자를 통한 LinkedList 객체 생성
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();

	}

	// add
	public void add(Member member) {
		linkedList.add(member);

	}

	// remove
	public boolean remove(int memberId) {
			Iterator<Member> it = linkedList.iterator(); //linkedList를 iterator형식으로 저장 
			while (it.hasNext()) { //읽는게 가능하면 계속 실행 
				Member member = it.next(); //linkedList 다음에 오는 요소를 Member 객체로 생성
				int temId = member.getMemberId(); //Member의 Id 값 리턴 ==> 다시 temID에 저장 
				if (temId == memberId) { //remove 인자와 비교
					linkedList.remove(member); //같으면 지워주기
					System.out.println("요청하신 아이디를 삭제하였습니다.");
					return true;
				}
			}
			System.out.println(memberId + "는 없습니다");
			return false;
		}
	
	

	// 출력
	public void showAllMember() {
		for (Member member : linkedList) //LinkedList의 값의 숫자대로 member에 저장하고 아래 실행문 실행  
			System.out.println(member);

	}

}
