package sec_verify06;

public class PriorityThread extends Thread {

	private String name;
	
	public PriorityThread(String name) {
		this.name = name;
		this.setName(name);
	}
	
	@Override
	public void run() {
		System.out.println(name + "�����尡 �����Ǿ����ϴ�.");
		for(int i = 0; i<5; i++) {
			System.out.println(name + "(�켱���� : " + this.getPriority() + ")");
		}
	}
	
}
