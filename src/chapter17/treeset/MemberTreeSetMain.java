package chapter17.treeset;

public class MemberTreeSetMain {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		//아이디 기준으로 정렬하기
		Member3 memberPark = new Member3(1003, "박서원");
		Member3 memberLee = new Member3(1004, "이찬이");
		Member3 memberSon = new Member3(1005, "소있");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		
		memberTreeSet.showAllMember();
		
		
		
	}

}
