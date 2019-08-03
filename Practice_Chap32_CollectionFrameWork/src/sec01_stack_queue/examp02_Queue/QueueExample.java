package sec01_stack_queue.examp02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		// Message객체를 저장할 수 있는 즉, Queue인터페이스를 구현한 linkedlist를 생성함.
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("SendMail", "홍길동"));
		messageQueue.offer(new Message("SendSMS", "신은혁"));
		messageQueue.offer(new Message("SendKakaoTALK", "김기수"));
		messageQueue.offer(new Message("SendFaceBook", "하리수"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			switch(message.getCommand()) {
			case "SendMail" : 
				System.out.println(message.getTo() + "에게 메일을 보냅니다.");
				break;
			case "SendSMS" :
				System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
				break;
			case "SendKakaoTALK" :
				System.out.println(message.getTo() + "에게 카카오톡을 보냅니다.");
				break;
			case "SendFaceBook" :
				System.out.println(message.getTo() + "에게 페이스북 메시지를 보냅니다.");
				break;
			}
		}
		
	}
}
