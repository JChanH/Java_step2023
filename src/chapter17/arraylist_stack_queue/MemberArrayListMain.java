package chapter17.arraylist_stack_queue;

public class MemberArrayListMain {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		// 팀원을듸 정보
		Member memberLee = new Member(0, "이지원 "); // Member를 불러서 자료 넣어줌
		Member memberSon = new Member(1, "손민국 ");
		Member memberPark = new Member(2, "박시원 ");
		Member memberHong = new Member(3, "홍길동 ");

		// ArrayList에 add 하는 method가 있어야함
		// ArrayList에 객체 넣어준다 (객체에 저장된 정보도 같이 들어간다)
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);

		// ArrayList에 delete 하는 method가 있어야함
		// 출력
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberHong.getMemberId());//매게변수에 저장된 ID를 삭제한다

		System.out.println("=============================");
		memberArrayList.showAllMember();

	}
}
