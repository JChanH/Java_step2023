package chapter19.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStreamTest {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		//일반적인 for문
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

		//람다식 (요소를 하나씩 꺼내서 출력하는 기능)
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		
		System.out.println(Arrays.stream(arr).sum());
		
		//-----------------------------------------------------
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//Integer를 int로 변경하고 
		list.stream().mapToInt(n -> n.intValue()).sum();
		
	}

}
