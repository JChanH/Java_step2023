package chapter17.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("java");
		list.add("oracle");
		list.add("Servlet/JSP");
		list.add(2, "Spring"); // 2번방에 자료 넣기
		list.add("Python");

		int size = list.size(); // 정보가 몇게 있는지 확인
		System.out.println("총 객체수 : " + size);
		System.out.println("-----------------------------------------");
		String skill = list.get(2);
		System.out.println("2 : " + skill);

		System.out.println("--------------------------");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);

		}
		System.out.println("-------------------------");
		list.remove(2); //2번방을 지운다
		list.remove(2); //2번방을 지운다
		list.remove("Python"); //2번방을 지운다
		list.remove("Spring"); //없는 정보를 입력하면 아무런 효과가 없다 
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);

		}
		
		
		
		
		
	}

}
