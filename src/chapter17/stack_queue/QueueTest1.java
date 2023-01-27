package chapter17.stack_queue;

import java.util.ArrayList;

class MyQueue { //큐는 first in first out
	private ArrayList<String> arrayQueue = new ArrayList<String>();

	public void enQueue(String data) {
		arrayQueue.add(data);

	}

	public String deQuene() {

		int len = arrayQueue.size();
		if(len ==0) {
			System.out.println("큐가 비어 있습니다.");
			return null;
			
		}
		return(arrayQueue.remove(0)); //인덱스 위치에 아이템을 리스트에서 삭제하고 객체는 리턴해준다
	}
}

public class QueueTest1 {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQuene()); //리턴받은 객체를 출력
		System.out.println(queue.deQuene());
		System.out.println(queue.deQuene());
		System.out.println(queue.deQuene());
		
		
		
		
	}
}
