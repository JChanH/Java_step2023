package chapter17.linkedlist;

import chapter17.arraylist_stack_queue.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		MemberLinkedList member = new MemberLinkedList();
		//순서를 유지하고 저장  중복 저장 가능함 
		//팀원들의 정보
		Member memberLee = new Member(0, "이지원 "); 
		Member memberSon = new Member(1, "손민국 ");
		Member memberPark = new Member(2, "박시원 ");
		Member memberHong = new Member(3, "홍길동 ");

		//정보 넣어주기
		member.add(memberLee);
		member.add(memberSon);
		member.add(memberPark);
		member.add(memberHong);
		
		member.showAllMember();
		System.out.println("------------------------------------");
		member.add(memberSon); //순서를 유지하면서 저장됨 (중간에 키고 들어기지 않음)
		member.showAllMember();
		
		
		
		
		
	}

}
