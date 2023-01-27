package chapter17.stack_queue;

import java.util.ArrayList;

//stack의 구조를 만들어 보자
class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();

	public void push(String data) { //Stack의 push를 구현해준다
		arrayStack.add(data);

	}

	public String pop() {
		int len = arrayStack.size(); //list의 사이즈를 len에 저장한다
		
		if (len == 0) { 
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		return (arrayStack.remove(len-1)); //size는 3이지만 2번째 0부터 2까지로 index가 구성되어 있음으로 2번 자리를 삭제하고 
		//return해주어야만 stack의 LIFO을 시행할수 있다 

	}
}

public class StackTest2 {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		// 정보 등록 (순서대로 차곡차곡 들어간다
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop()); //없으면 null을 반환한다
		
	}

}
