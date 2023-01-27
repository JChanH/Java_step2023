package chapter17.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long startTime;
		long endTime;

		
		//ArrayList의 속도 측정 //0번째 자리에 계속 자료를 추가하면 계속 뒤로 밀린다
		startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			list1.add(0, String.valueOf(i));

		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 걸린시간 : " + (endTime-startTime)); //724166994

		
		
		//LinkedList의 속도 측정 //각 요소에 다음 요소에 대한 주소값이 있기때문에 값을 추가하더라도 주소값만 변경하면 되기 때문에 더 빠르다
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list2.add(0, String.valueOf(i));

		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 걸린시간 : " + (endTime-startTime)); //21787746

	}

}
