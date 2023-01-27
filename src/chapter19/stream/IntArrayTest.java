package chapter19.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		// 한번 생성된 스트림은 재 사용시 다시 생성해야함

		// count()는 long 타입임으로 downcasting 해주어야 함
		int count = (int) Arrays.stream(arr).count(); // 지금 가지고있는 요소 카운트

		// sum()은 Integer로 반환 (묵시적 형변환)
		int sumVal = Arrays.stream(arr).sum(); // 총합

		System.out.println(count); // 요소들의 갯수
		System.out.println(sumVal); // 요소들의 총합

		
		//int => Intstream 타입으로 변경함
		IntStream stream =Arrays.stream(arr);
		
		int sum = stream.sum();
		System.out.println(sum);
		
		//위에서 한번 사용한 것은 다시 사용 불가능
		//count = stream.count(); // ERROR
		
		int count2 =(int) Arrays.stream(arr).count();
		
		
		//reduce(초기값, 전달되는 요소 -> 각 요소가 수행해야 하는 기능)
		//람다식 구현 가능함 
		System.out.println(Arrays.stream(arr).reduce(0, (a,b) -> a+b));
	}

}
