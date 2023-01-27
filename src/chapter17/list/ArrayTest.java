package chapter17.list;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		int iArray[] = { 50, 40, 30, 20 };
		String sArray[] = new String[5];
		//Array클래스는 항목 정렬, 검색, 항목 비교에 관한 메서드 
		
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray); //정력해줌 
		System.out.println(Arrays.toString(iArray));
		
		
		Arrays.fill(sArray, "good!"); //빈 자리를 전부 채워줌 
		System.out.println(Arrays.toString(sArray));
	
		
		//Arrays.asList = 일반 배열을 리스트로 넣어준다  (본래 Array는 fix되어 있다)
		List<String> City = Arrays.asList("Soeul", "Inchon", "Busan", "Jeju", "Deaeon");
		
		for (int i = 0; i < City.size(); i++) 
			System.out.print(City.get(i));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
