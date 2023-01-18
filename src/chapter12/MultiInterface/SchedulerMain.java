package chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요:");
			char choice = scan.next().charAt(0); // String을 Char로 변경해준다
			// 문자(아스키 코드로 형변환)
			//자바에서는 기본적으로 ASCII 코드 값이 입력됩니다.
			//System.in.read(); // 숫자 하나를 입력받아 그래도 출력하고 하

			Scheduler scheduler = null; // 우선 선언만 해둔다

			// 객체생성
			if (choice == 82 || choice == 'r') {// charater 값이기 때문에 숫자 or 문자열로 출력 가능함
				scheduler = new RoundRobin();

			} else if (choice == 76 || choice == 'l') {
				scheduler = new LeastJob();

			} else if (choice == 80 || choice == 112) {
				scheduler = new priorityAllocation();

			} else if (choice == 'S' || choice == 's'){
				System.out.println("시스템을 종료합니다");
				break;
			}else {
				System.out.println("지원하지 않는 기능입니다.");
				continue;
			}
			//공통으로 쓰이는것들은 묶어두기
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}

	}
}
