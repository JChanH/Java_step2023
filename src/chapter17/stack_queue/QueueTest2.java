package chapter17.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {

	public static void main(String[] args) {

		Queue<Message> messageQueue = new LinkedList<Message>();
		// offer : 입력
		messageQueue.offer(new Message("sendMail", "홍길동")); //QUeue에 자리를 할당하고 그안에 Message의 객체를 넣는다
		messageQueue.offer(new Message("sendSMS", "김유신"));
		messageQueue.offer(new Message("sendKakaotalk", "이순신"));

		// poll : 출력
		while (!messageQueue.isEmpty()) { //먼져 들어간 정보가 먼저 나온다
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냅니다");
				break;
				
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다");
				break;
			}
		}

	}

}
