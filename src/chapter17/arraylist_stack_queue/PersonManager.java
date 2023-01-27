package chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {
		int select;
		Person p; // 선언만 해둠

		ArrayList<Person> personArr = new ArrayList<Person>();

		outer : while (true) {
			System.out.print("1. 회원추가");
			System.out.print("2. 회원탈퇴");
			System.out.print("3. 회원정보");
			System.out.print("4. 종   료");
			System.out.print("항목선택 : ");

			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();
			switch (select) {
			// 정보추가
			case 1:
				p = new Person(); // 정보를 추가할 때마다 Person객체를 새로 생성합니다. (팩키지화)
				System.out.println("--------------정보 추가----------------");
				System.out.println("이름 : ");
				p.setName(scan.next());
				System.out.println("나이 : ");
				p.setAge(scan.nextInt());
				System.out.println("전번 : ");
				p.setTel(scan.next());
				personArr.add(p); // 정보를 ArrayList에 넣음
				System.out.println("정보가 저장되었습니다.");
				break;
			// 다시 1번 입력하면 다름 자리에 추가됨!!!
			case 2:
				System.out.println("--------------정보 삭제---------------");
				System.out.println("삭제할 이름 :"); //어떤 정보를 삭제할건지....
				String name = scan.next();
				for (int i = 0; i < personArr.size(); i++) {
					if ((personArr.get(i).getName()).equals(name)) { //정보가 같은 경우에 삭제해주기 
						personArr.remove(i); //해당 객체를 삭제하면서 포함되는 instance변수 전부 삭제된다 
						System.out.println(name + "의 정보를 삭재했습니다");
						break;
					} else { //size만큼 돌아보면서 비교해주고  없으면 아래 시행
						if (i + 1 == personArr.size()) //(배열의 사이즈와 돌았던 횟수와 같으면 출력) //없어도 상관없음 
							System.out.println(name + "이 존재하지 않습니다.");
					}
				}
				break;
			case 3:
				System.out.println("---------전체정보----------");
				Iterator<Person> it = personArr.iterator(); 
				while (it.hasNext()) { //personArr의 값이 있는한 반복
					Person person = it.next(); //다음 값 가져와서 저장
					System.out.println(person.getName());
					System.out.println(person.getAge());
					System.out.println(person.getTel());
					
				}
				break;
				
				
			/*case 3:
				System.out.println("-------전체정보----------");
				for (int i = 0; i < personArr.size(); i++) {
					System.out.println(personArr.get(i).getName());
					System.out.println(personArr.get(i).getAge());
					System.out.println(personArr.get(i).getTel());
				}
				break;
			*/
			case 4:
				System.out.println("시스템을 종료합니다.");
				break outer;
			}

			scan.close();
		}
	}

}
