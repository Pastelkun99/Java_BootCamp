package sec_verify05;

import java.util.Scanner;

public class ExecuteThread extends Thread {

	private boolean stop;
	int i = 1;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			System.out.print("�� �� �� �����ұ�� >> ");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			
			System.out.println(input + "�� �� �����մϴ�.");
			
			try {
				for(int i = 1; i<=input; i++) {
				System.out.println("���� �� >> i �� ��ȭ : " + i);
				Thread.sleep(1000);
			}
			} catch (Exception e) {}
			
		}
		System.out.println("���� ����");
	} 
}
