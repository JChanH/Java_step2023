package chapter08;

import java.util.Scanner;

public class Guide {

	public Guide() {
		// TODO Auto-generated constructor stub
	}
	
	static String point; // 목적지 //전역변수로 설정함 (다른 클라스에서도 자유롭게 access 쌉가능)
	Guest[] guest; // 관광객 정보 (객체만 생성해주기)
	Scanner scan = new Scanner(System.in);

	// 생성자 초기화 (인스턴스 변수를 초기화 시키는 역할)
	public Guide(int n) { // return 값은 필요없음
		point = "발리";
		guest = new Guest[n]; // 생성된 객체에 정보 넣어주기
		System.out.println("관광객 등록");
		for (int i = 0; i < guest.length; i++) {
			// 돌면서 각각 객체 생성을 해준다
			guest[i] = new Guest();
		}
		// 나이와 성별을 입력해준다
		for (int i = 0; i < guest.length; i++) {
			System.out.println((i + 1) + ".이름 :");
			guest[i].setName(scan.next());
			System.out.println((i + 1) + ".성별 :");
			guest[i].setGender(scan.next());
			System.out.println("---------------------------------");
		}
	}

	public void List(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + ".이름 :" + guest[i].getName());
			System.out.println((i + 1) + ".성별 :" + guest[i].getGender());
			System.out.println("---------------------------------");
		}
	}

	public void Start() { //시작버튼 
		System.out.println("관광객 수 :");
		int n = scan.nextInt();
		Guide obj1 = new Guide(n);
		obj1.List(n);
		obj1.Menu();

	}

	public void Info() {
		for (int i = 0; i < guest.length; i++) {
			System.out.println((i + 1) + ".이름 :" + guest[i].getName());
			System.out.println((i + 1) + ".성별 :" + guest[i].getGender());
			System.out.println((i + 1) + ".목적지 :" + Guide.point);
			System.out.println("---------------------------------");
		}
	}

	public void Menu() {

		boolean run = true;
		while (run) {

			// 메뉴
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			int key = scan.nextInt();

			switch (key) {
			case 1:
				System.out.println("선택 >" + key);
				Info(); // 고객 정보
				break;

			case 2:
				System.out.println("선택 >" + key);
				System.out.println("어디로 변경하시겠습니까?");
				String dst = scan.next();
				Guide.point = dst; // 목적지 변경
				System.out.println(dst + "로 목적지 변경됨");
				break;

			case 3:
				System.out.println("종료");
				run = false;
				break;

			default:
				System.out.println("숫자를 잘못 입력하셨습니다.");
				break;
			}

		}
	}

}
