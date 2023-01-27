package chapter17.stack_queue;

import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {

		Object obj;
		// empty 스택 생성
		Stack<Object> st = new Stack<Object>(); 
		if (st.empty()) { // 스택이 비어있으면
			for (int i = 0; i <= 5; i++) {
				st.push(new String("Hi!" + i)); // add = push (stack에 정보 넣어주기) //차례대로 쌓인다 
				System.out.println("입력" + i + "번째 : " + st.peek()); // peek 가장 위에 있는 값을 출력한다 

			}

		}
		st.pop(); // 가장 위에 있는 자료(peek)뽑아내기 
		System.out.println("현재 Top의 위치(peek) : " + st.peek()); //가장 위에 있는 값 확인 
		st.pop();
		System.out.println("현재 Top의 위치(peek) : " + st.peek()); //가장 위에 있는 값 확인 
		st.push(new String ("Happy!!"));
		System.out.println(st.peek());
		st.push(new String ("Good!"));
		System.out.println(st.peek());
	
	
	}

}
