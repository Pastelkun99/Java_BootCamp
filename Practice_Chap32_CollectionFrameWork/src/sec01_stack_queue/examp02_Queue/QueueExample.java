package sec01_stack_queue.examp02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		// Message��ü�� ������ �� �ִ� ��, Queue�������̽��� ������ linkedlist�� ������.
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("SendMail", "ȫ�浿"));
		messageQueue.offer(new Message("SendSMS", "������"));
		messageQueue.offer(new Message("SendKakaoTALK", "����"));
		messageQueue.offer(new Message("SendFaceBook", "�ϸ���"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			switch(message.getCommand()) {
			case "SendMail" : 
				System.out.println(message.getTo() + "���� ������ �����ϴ�.");
				break;
			case "SendSMS" :
				System.out.println(message.getTo() + "���� SMS�� �����ϴ�.");
				break;
			case "SendKakaoTALK" :
				System.out.println(message.getTo() + "���� īī������ �����ϴ�.");
				break;
			case "SendFaceBook" :
				System.out.println(message.getTo() + "���� ���̽��� �޽����� �����ϴ�.");
				break;
			}
		}
		
	}
}
