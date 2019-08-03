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
			System.out.print("몇 초 후 종료할까요 >> ");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			
			System.out.println(input + "초 후 종료합니다.");
			
			try {
				for(int i = 1; i<=input; i++) {
				System.out.println("실행 중 >> i 값 변화 : " + i);
				Thread.sleep(1000);
			}
			} catch (Exception e) {}
			
		}
		System.out.println("실행 종료");
	} 
}
