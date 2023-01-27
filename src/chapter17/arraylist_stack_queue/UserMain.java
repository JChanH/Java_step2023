package chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		ArrayList<UserInfo> arr = new ArrayList<>();

		outer : while (true) {
			System.out.print("아이디 생성 : ");
			Scanner scan = new Scanner(System.in);
			UserInfo ui = new UserInfo();
			ui.setId(scan.next());

			// 아이디 중복체크
			for (int i = 0 ; i <arr.size() ; i++) { //아직 초기이지만 정보가 있다고 가정하에 작성 
				if(ui.getId().equals(arr.get(i).getId())) { // 내부의 정보를 비교해준다 (아이디에 저장된 정보들을 비교)
					System.out.println("아이디가 중복되었습니다. 다시 입력하세요.");
			        continue outer; //아이디 다시 입력해줌 
				}
				// 중복된 아니디가 아니라면 pwd입력
			}
				System.out.println("패스워드를 입력하세요 : ");
				Scanner scan2 = new Scanner(System.in); //새로 입력함으로 새로운 스캔
				ui.setPwd(scan2.nextInt());
				//중복이 아니면 리스트에 넣어준다
				arr.add(ui);
				
				for(int i = 0; i <arr.size(); i++) {
					System.out.println("아이디 : "+ ui.getId() + "비밀번호 : " + ui.getPwd());
					
				}
				
				
				
		}

	}

}
