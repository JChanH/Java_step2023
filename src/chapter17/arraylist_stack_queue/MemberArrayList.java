package chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	// ArrayList 선언만 (arrayList)
	private ArrayList<Member> arrayList; // Member 클라스만 들어올 수 있는 List 만들어줌

	public MemberArrayList() { // 다른 클래스에서 불러오면 Array를 만들어줌
		// heap 생성 (객체가 들어감)
		arrayList = new ArrayList<Member>();
	}

	public void addMember(Member member) {
		arrayList.add(member);

	}// 리스트 출력하기

	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member); // toString이 반환된다
		}
	}

	// 삭제 회원의 아이디를 기준으로
	public boolean removeMember(int memberId) {
		Iterator<Member> it = arrayList.iterator(); // arrayList를 Iterator에 입력함

		while (it.hasNext()) { // 다음 정보가 있으면 계속 실행
			Member member = it.next(); // 다음 객체를 Member 타입으로 저장함
			int tempId = member.getMemberId(); // 맴버의 아이디를 tempId에 저장
			if (tempId == memberId) { //번호가 같으면 
				arrayList.remove(member); //리스트에서 지워준다
				return true; //

			} // if
		} // while
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

}
